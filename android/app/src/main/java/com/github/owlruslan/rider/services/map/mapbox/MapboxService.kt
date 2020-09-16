package com.github.owlruslan.rider.services.map.mapbox

import android.content.Context
import android.graphics.Color
import android.widget.Toast
import androidx.collection.ArrayMap
import com.github.owlruslan.rider.R
import com.github.owlruslan.rider.di.ActivityScoped
import com.mapbox.api.directions.v5.DirectionsCriteria
import com.mapbox.api.directions.v5.MapboxDirections
import com.mapbox.api.directions.v5.models.DirectionsResponse
import com.mapbox.api.directions.v5.models.DirectionsRoute
import com.mapbox.core.constants.Constants
import com.mapbox.geojson.Feature
import com.mapbox.geojson.FeatureCollection
import com.mapbox.geojson.LineString
import com.mapbox.geojson.Point
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory
import com.mapbox.mapboxsdk.geometry.LatLng
import com.mapbox.mapboxsdk.geometry.LatLngBounds
import com.mapbox.mapboxsdk.maps.MapboxMap
import com.mapbox.mapboxsdk.maps.Style
import com.mapbox.mapboxsdk.style.layers.LineLayer
import com.mapbox.mapboxsdk.style.layers.Property
import com.mapbox.mapboxsdk.style.layers.PropertyFactory
import com.mapbox.mapboxsdk.style.layers.SymbolLayer
import com.mapbox.mapboxsdk.style.sources.GeoJsonSource
import com.mapbox.mapboxsdk.utils.BitmapUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber
import javax.inject.Inject

@ActivityScoped
class MapboxService @Inject constructor() : Mapbox {

    @Inject
    lateinit var context: Context

    private lateinit var mapboxMap: MapboxMap
    lateinit var currentRoute: DirectionsRoute
    private lateinit var client: MapboxDirections

    override fun init(mapboxMap: MapboxMap) {
        this.mapboxMap = mapboxMap
    }

    private fun createDirectionsClient(start: Point, end: Point) =
        MapboxDirections.builder()
            .origin(start)
            .destination(end)
            .overview(DirectionsCriteria.OVERVIEW_FULL)
            .profile(DirectionsCriteria.PROFILE_DRIVING)
            .accessToken(context.getString(R.string.mapbox_access_token))
            .build()

    private fun setRouteSource(route: DirectionsRoute, routeId: String, style: Style) {
        style.getSourceAs<GeoJsonSource>(routeId)?.setGeoJson(
            FeatureCollection.fromFeature(
                Feature.fromGeometry(
                    LineString.fromPolyline(
                        route.geometry()!!,
                        Constants.PRECISION_6
                    )
                )
            )
        )
    }

    private fun getDirectionsRouteFromResponse(response: Response<DirectionsResponse>) = response.body()!!.routes()[0]

    private fun createRouteLatLngListFromDirectionsRoute(route: DirectionsRoute): ArrayList<LatLng> {
        val routeLatLngList = ArrayList<LatLng>()
        val routeCoordinates = LineString.fromPolyline(route.geometry()!!, Constants.PRECISION_6).coordinates()
        for (point: Point in routeCoordinates) {
            routeLatLngList.add(LatLng(point.latitude(), point.longitude()))
        }
        return routeLatLngList
    }

    private fun setCameraBoundsWithBottomPadding(routeLatLngList: List<LatLng>): LatLngBounds =
        LatLngBounds.Builder()
            .includes(routeLatLngList)
            .build()

    private fun setCameraToTopOfScreen(route: DirectionsRoute) {
        val bounds = setCameraBoundsWithBottomPadding(
            createRouteLatLngListFromDirectionsRoute(route)
        )
        mapboxMap.moveCamera(
            CameraUpdateFactory
                .newLatLngBounds(bounds, 200, 200, 200, 800)
        )
    }

    private fun showToast(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }

    override fun showRoute(style: Style, start: Point, end: Point) {
        client = createDirectionsClient(start, end)
        client.enqueueCall(object : Callback<DirectionsResponse> {

            override fun onResponse(call: Call<DirectionsResponse>, response: Response<DirectionsResponse>) {
                println(call.request().url().toString())
                currentRoute = getDirectionsRouteFromResponse(response)
                if (style.isFullyLoaded) {
                    setRouteSource(currentRoute, ROUTE_SOURCE_ID, style)
                    setCameraToTopOfScreen(currentRoute)
                }
            }

            override fun onFailure(call: Call<DirectionsResponse>, throwable: Throwable) {
                Timber.e("Error: %s", throwable.message)
                showToast("Error: " + throwable.message)
            }
        })
    }

    public fun addSource(style: Style, sourceId: String, point: Point?) {
        if (point != null)
            style.addSource(
                GeoJsonSource(
                    sourceId,
                    FeatureCollection.fromFeatures(
                        arrayOf(Feature.fromGeometry(Point.fromLngLat(point.longitude(), point.latitude())))
                    )
                )
            )
        else style.addSource(GeoJsonSource(sourceId, FeatureCollection.fromFeatures(arrayOf())))
    }

    override fun addMapboxSources(style: Style, points: ArrayMap<String, Point>) {
        val sources = arrayOf(
            Source(ROUTE_SOURCE_ID, null),
            Source(PICKUP_ICON_SOURCE_ID, points["start"]),
            Source(PULSE_CIRCLE_SOURCE_ID, points["start"]),
            Source(DROPOFF_ICON_SOURCE_ID, points["end"]) ,
            Source(CAR_ICON_SOURCE_ID, null)
        )
        sources.forEach { source: Source ->
            when (source.id) {
                ROUTE_SOURCE_ID -> addSource(style, source.id, source.point)
                PICKUP_ICON_SOURCE_ID -> addSource(style, source.id, source.point)
                PULSE_CIRCLE_SOURCE_ID -> addSource(style, source.id, source.point)
                DROPOFF_ICON_SOURCE_ID -> addSource(style, source.id, source.point)
                CAR_ICON_SOURCE_ID -> addSource(style, source.id, source.point)
            }
        }
    }

    private fun addLayerOfRoute(style: Style) {
        style.addLayer(LineLayer(ROUTE_LAYER_ID, ROUTE_SOURCE_ID).apply {
            this.setProperties(
                PropertyFactory.lineCap(Property.LINE_CAP_ROUND),
                PropertyFactory.lineJoin(Property.LINE_JOIN_ROUND),
                PropertyFactory.lineWidth(ROUTE_LINE_WIDTH),
                PropertyFactory.lineColor(Color.parseColor(ROUTE_LINE_COLOR))
            )
        })
    }

    private fun addImageOfPickupIcon(style: Style) {
        val drawable = context.resources.getDrawable(R.drawable.ic_source, null)
        style.addImage(PICKUP_MARKER_IMAGE_ID, BitmapUtils.getBitmapFromDrawable(drawable)!!)
    }

    private fun addLayerOfPickupIcon(style: Style) {
        addImageOfPickupIcon(style)
        style.addLayer(SymbolLayer(PICKUP_ICON_LAYER_ID, PICKUP_ICON_SOURCE_ID).apply {
            this.withProperties(
                PropertyFactory.iconImage(PICKUP_MARKER_IMAGE_ID),
                PropertyFactory.iconIgnorePlacement(true)
            )
        })
    }

    private fun addImageOfPulseCircle(style: Style) {
        val drawable = context.resources.getDrawable(R.drawable.pulse_circle, null)
        style.addImage(PULSE_CIRCLE_IMAGE_ID, BitmapUtils.getBitmapFromDrawable(drawable)!!)
    }

    private fun addLayerOfPulseCircle(style: Style) {
        addImageOfPulseCircle(style)
        style.addLayerBelow(SymbolLayer(PULSE_CIRCLE_LAYER_ID, PULSE_CIRCLE_SOURCE_ID).apply {
            this.withProperties(
                PropertyFactory.iconImage(PULSE_CIRCLE_IMAGE_ID),
                PropertyFactory.iconIgnorePlacement(true)
            )
        }, PICKUP_ICON_LAYER_ID)
    }

    private fun addImageOfDropoffIcon(style: Style) {
        val drawable = context.resources.getDrawable(R.drawable.ic_destination, null)
        style.addImage(DROPOFF_MARKER_IMAGE_ID, BitmapUtils.getBitmapFromDrawable(drawable)!!)
    }

    private fun addLayerOfDropoffIcon(style: Style) {
        addImageOfDropoffIcon(style)
        style.addLayer(SymbolLayer(DROPOFF_ICON_LAYER_ID, DROPOFF_ICON_SOURCE_ID).apply {
            this.withProperties(
                PropertyFactory.iconImage(DROPOFF_MARKER_IMAGE_ID),
                PropertyFactory.iconIgnorePlacement(true)
            )
        })
    }

    private fun addImageOfCarIcon(style: Style) {
        val drawable = context.resources.getDrawable(R.drawable.ic_car, null)
        style.addImage(CAR_IMAGE_ID, BitmapUtils.getBitmapFromDrawable(drawable)!!)
    }

    public fun addLayerOfCarIcon(style: Style) {
        addImageOfDropoffIcon(style)
        style.addLayer(SymbolLayer(CAR_ICON_LAYER_ID, CAR_ICON_SOURCE_ID).apply {
            this.withProperties(
                PropertyFactory.iconImage(CAR_IMAGE_ID),
                PropertyFactory.iconIgnorePlacement(true)
            )
        })
    }

    override fun addMapboxLayers(style: Style) {
        addLayerOfRoute(style)
        addLayerOfPickupIcon(style)
        addLayerOfPulseCircle(style)
        addLayerOfDropoffIcon(style)
        addLayerOfCarIcon(style)
    }

    override fun cancelCall() {
        client.cancelCall()
    }

    companion object {
        private const val ROUTE_LAYER_ID = "route-layer-id"
        private const val ROUTE_SOURCE_ID = "route-source-id"
        private const val PICKUP_ICON_SOURCE_ID = "pickup-icon-source-id"
        private const val PULSE_CIRCLE_SOURCE_ID = "pulse-circle-source-id"
        private const val DROPOFF_ICON_SOURCE_ID = "dropoff-icon-source-id"
        const val CAR_ICON_SOURCE_ID = "car-icon-source-id"

        const val PICKUP_ICON_LAYER_ID = "pickup-icon-layer-id"
        const val PULSE_CIRCLE_LAYER_ID = "pulse-circle-layer-id"
        const val DROPOFF_ICON_LAYER_ID = "dropoff-icon-layer-id"
        const val CAR_ICON_LAYER_ID = "car-icon-layer-id"

        private const val PICKUP_MARKER_IMAGE_ID = "pickup-marker-image-id"
        private const val PULSE_CIRCLE_IMAGE_ID = "pulse-circle-image-id"
        private const val DROPOFF_MARKER_IMAGE_ID = "dropoff-marker-image-id"
        private const val CAR_IMAGE_ID = "car-image-id"

        private const val ROUTE_LINE_COLOR = "#0062FF"
        private const val ROUTE_LINE_WIDTH = 5f
    }
}