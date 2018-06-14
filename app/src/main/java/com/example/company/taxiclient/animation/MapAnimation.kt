package com.example.company.taxiclient.animation

import android.animation.*
import android.app.Activity
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Handler
import android.os.SystemClock
import android.support.v7.widget.CardView
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.LinearInterpolator
import android.widget.Toast
import com.akexorcist.googledirection.DirectionCallback
import com.akexorcist.googledirection.constant.RequestResult
import com.akexorcist.googledirection.constant.TransportMode
import com.akexorcist.googledirection.model.Direction
import com.akexorcist.googledirection.model.Route
import com.akexorcist.googledirection.util.DirectionConverter
import com.example.company.taxiclient.R
import com.example.company.taxiclient.R.id.final_cardview
import com.example.company.taxiclient.data.MapRequestData
import com.example.company.taxiclient.fragments.MapFragment
import com.example.company.taxiclient.services.GoogleDirectionProvider
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.*
import kotlinx.android.synthetic.main.fragment_map.*
import java.util.ArrayList

class MapAnimation(val map: GoogleMap, val googleDirectionProvider: GoogleDirectionProvider,
                   val activity: Context?, val mapRequestData: MapRequestData) {

    companion object {
        private const val POLYLINE_COLOR = Color.MAGENTA
        private const val POLYLINE_WIDTH = 5
    }

    lateinit var final_cardview: CardView

    val markers = ArrayList<Marker>()

    private lateinit var start: Marker

    lateinit var polyline: Polyline

    fun animateMarker(marker: Marker, toPosition: LatLng,
                      hideMarker: Boolean, animSpeed: Long,
                      map: GoogleMap, callback: () -> Unit) {

        val handler = Handler()
        val start = SystemClock.uptimeMillis()
        val proj = map.getProjection()
        val startPoint = proj.toScreenLocation(marker.position)
        val startLatLng = proj.fromScreenLocation(startPoint)
        val duration: Long = animSpeed

        val interpolator = LinearInterpolator()

        handler.post(object : Runnable {

            override fun run() {
                val elapsed = SystemClock.uptimeMillis() - start
                val t = interpolator.getInterpolation(elapsed.toFloat() / duration)
                val lng = t * toPosition.longitude + (1 - t) * startLatLng.longitude
                val lat = t * toPosition.latitude + (1 - t) * startLatLng.latitude
                marker.setPosition(LatLng(lat, lng))

                if (t < 1.0) {
                    // Post again 16ms later.
                    handler.postDelayed(this, 16)
                } else {
                    marker.isVisible = hideMarker
                    callback()
                }
            }
        })
    }

    fun showRouteBetweenTwoPoints(start: LatLng, end: LatLng, transportMode: String, callback: GoogleMap.CancelableCallback) {
        googleDirectionProvider.execute(start, end, transportMode, object : DirectionCallback {
            override fun onDirectionSuccess(direction: Direction, rawBody: String) {
                val status = direction.getStatus()
                if (direction.isOK) {
                    map.addMarker(MarkerOptions()
                            .position(start)
                            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)))
                    map.addMarker(MarkerOptions()
                            .position(end)
                            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)))

                    val route = direction.routeList[0]
                    val directionPositionList = route.legList[0].directionPoint
                    polyline = map.addPolyline(DirectionConverter.createPolyline(
                            activity, directionPositionList, POLYLINE_WIDTH, POLYLINE_COLOR))

                    setCameraWithCoordinationBounds(route, map, callback)

                } else if (status == RequestResult.NOT_FOUND) {
                }
            }

            override fun onDirectionFailure(t: Throwable) {}
        })
    }

    fun animateRouteDriveForDriver(start: LatLng, end: LatLng, transportMode: String) {

        googleDirectionProvider.execute(start, end, transportMode, object : DirectionCallback {

            override fun onDirectionSuccess(direction: Direction, rawBody: String) {
                val status = direction.getStatus()
                if (direction.isOK) {
                    markers.clear()
                    map.clear()

                    map.addMarker(MarkerOptions().position(start))
                    map.addMarker(MarkerOptions().position(end))

                    val directionPositionList = direction.routeList[0].legList[0].directionPoint
                    polyline = map.addPolyline(DirectionConverter.createPolyline(
                            activity, directionPositionList, POLYLINE_WIDTH, POLYLINE_COLOR))
                    //setCameraWithCoordinationBounds(route, map)


                    MapUtils.addMarkersToMap(directionPositionList, markers, map)
                    startAnimation(MyCancelableCallbackDriver)
                } else if (status == RequestResult.NOT_FOUND) {
                }
            }

            override fun onDirectionFailure(t: Throwable) {}
        })
    }

    fun animateRouteDrive(start: LatLng, end: LatLng, transportMode: String) {

        googleDirectionProvider.execute(start, end, transportMode, object : DirectionCallback {

            override fun onDirectionSuccess(direction: Direction, rawBody: String) {
                val status = direction.getStatus()
                if (direction.isOK) {
                    markers.clear()
                    map.clear()

                    map.addMarker(MarkerOptions().position(start))
                    map.addMarker(MarkerOptions().position(end))

                    val directionPositionList = direction.routeList[0].legList[0].directionPoint
                    polyline = map.addPolyline(DirectionConverter.createPolyline(
                            activity, directionPositionList, POLYLINE_WIDTH, POLYLINE_COLOR))
                    //setCameraWithCoordinationBounds(route, map)


                    MapUtils.addMarkersToMap(directionPositionList, markers, map)
                    startAnimation(MyCancelableCallback)
                } else if (status == RequestResult.NOT_FOUND) {
                }
            }

            override fun onDirectionFailure(t: Throwable) {}
        })
    }

    fun startAnimation(callback: GoogleMap.CancelableCallback) {
        currentPt = 0
        map.getUiSettings().setAllGesturesEnabled(false)

        start = map.addMarker(MarkerOptions()
                .position(mapRequestData.start)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.taxi_marker))
                .title("START"))


        map.animateCamera(
                CameraUpdateFactory.newLatLngZoom(mapRequestData.start, map.getCameraPosition().zoom),
                3000,
                callback)

        currentPt = 0 - 1
    }

    var currentPt: Int = 0

    var MyCancelableCallbackDriver: GoogleMap.CancelableCallback = object : GoogleMap.CancelableCallback {

        override fun onCancel() {
            map.getUiSettings().setAllGesturesEnabled(true)
        }

        override fun onFinish() {

            map.uiSettings.setZoomControlsEnabled(false)

            if (++currentPt <= markers.size) {

                val targetLatLng = markers.get(currentPt).getPosition()

                System.out.println(" ------- " + currentPt + " - " + markers.size)

                if (currentPt == 1) {
                } else {
                    start.position = targetLatLng
                }

                val cameraPosition = CameraPosition
                        .Builder()
                        .target(targetLatLng)
                        .zoom(map.getCameraPosition().zoom)
                        .build()

                val markerAnimator = ObjectAnimator.ofObject(
                        start,
                        "position",
                        LatLngEvaluator(),
                        start.position,
                        targetLatLng)
                markerAnimator.setDuration(10)
                markerAnimator.start()

                map.animateCamera(
                        CameraUpdateFactory.newCameraPosition(cameraPosition),
                        10,
                        if (currentPt == markers.size - 1) FinalCancelableCallbackDriver else this)
            }
        }
    }

    var FinalCancelableCallbackDriver: GoogleMap.CancelableCallback = object : GoogleMap.CancelableCallback {
        override fun onFinish() {
            //GoogleMapUtis.fixZoomForMarkers(map, markers)
            onCancel()
        }

        override fun onCancel() {}
    }

    var MyCancelableCallback: GoogleMap.CancelableCallback = object : GoogleMap.CancelableCallback {

        override fun onCancel() {
            map.getUiSettings().setAllGesturesEnabled(true)
        }

        override fun onFinish() {

            map.uiSettings.setZoomControlsEnabled(false)

            if (++currentPt <= markers.size) {

                val targetLatLng = markers.get(currentPt).getPosition()

                System.out.println(" ------- " + currentPt + " - " + markers.size)

                if (currentPt == 1) {
                } else {
                    start.position = targetLatLng
                }

                val cameraPosition = CameraPosition
                        .Builder()
                        .target(targetLatLng)
                        .zoom(map.getCameraPosition().zoom)
                        .build()

                val markerAnimator = ObjectAnimator.ofObject(
                        start,
                        "position",
                        LatLngEvaluator(),
                        start.position,
                        targetLatLng)
                markerAnimator.setDuration(10)
                markerAnimator.start()

                map.animateCamera(
                        CameraUpdateFactory.newCameraPosition(cameraPosition),
                        10,
                        if (currentPt == markers.size - 1) FinalCancelableCallback else this)
            }
        }
    }

    var FinalCancelableCallback: GoogleMap.CancelableCallback = object : GoogleMap.CancelableCallback {
        override fun onFinish() {
            Toast.makeText(activity, "FINAL!!!", Toast.LENGTH_SHORT).show()
            final_cardview.visibility = View.VISIBLE
            //GoogleMapUtis.fixZoomForMarkers(map, markers)
            onCancel()
        }

        override fun onCancel() {}
    }

    fun showSearchRipplesVisualization(point: LatLng, duration: Long): ValueAnimator {
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(point, 16.0f))
        // The drawable to use for the circle
        val d = GradientDrawable()
        d.setShape(GradientDrawable.OVAL);
        d.setSize(500, 500);
        d.setColor(Color.argb(20, 0, 0, 0));
        d.setStroke(5, Color.TRANSPARENT);

        val bitmap = Bitmap.createBitmap(d.getIntrinsicWidth(), d.getIntrinsicHeight(), Bitmap.Config.ARGB_8888)
        // Convert the drawable to bitmap
        val canvas = Canvas(bitmap)
        d.setBounds(0, 0, canvas.getWidth(), canvas.getHeight())
        d.draw(canvas)
        // Radius of the circle
        val radius: Float = 200.0f
        // Add the circle to the map
        val circle = map.addGroundOverlay(GroundOverlayOptions()
                .position(point, 2 * radius).image(BitmapDescriptorFactory.fromBitmap(bitmap)))

        val valueAnimator: ValueAnimator = ValueAnimator()
        valueAnimator.setRepeatCount(ValueAnimator.INFINITE)
        valueAnimator.setRepeatMode(ValueAnimator.RESTART)
        valueAnimator.setIntValues(0, radius.toInt())
        valueAnimator.setDuration(duration)
        valueAnimator.setEvaluator(IntEvaluator())
        valueAnimator.setInterpolator(AccelerateDecelerateInterpolator())
        valueAnimator.addUpdateListener {
            val animatedFraction = valueAnimator.getAnimatedFraction()
            circle.setDimensions(animatedFraction * radius * 2)
        }
        valueAnimator.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                circle.remove()
            }
        })
        return valueAnimator
    }

    private fun setCameraWithCoordinationBounds(route: Route, map: GoogleMap, callback: GoogleMap.CancelableCallback) {
        val southwest = route.bound.southwestCoordination.coordination
        val northeast = route.bound.northeastCoordination.coordination
        val bounds = LatLngBounds(southwest, northeast)
        map.animateCamera(CameraUpdateFactory.newLatLngBounds(bounds, 100), callback)
    }

    private class LatLngEvaluator : TypeEvaluator<LatLng> {

        // Method is used to interpolate the marker animation.
        override fun evaluate(fraction: Float, startValue: LatLng, endValue: LatLng): LatLng {
            val latitude = startValue.latitude + (endValue.latitude - startValue.latitude) * fraction
            val longitude = startValue.longitude + (endValue.longitude - startValue.longitude) * fraction
            return LatLng(latitude, longitude)
        }
    }
}