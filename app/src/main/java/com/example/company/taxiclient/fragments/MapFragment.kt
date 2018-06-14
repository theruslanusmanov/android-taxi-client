package com.example.company.taxiclient.fragments

import android.animation.*
import android.graphics.Bitmap

import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

import com.akexorcist.googledirection.DirectionCallback
import com.akexorcist.googledirection.constant.RequestResult
import com.akexorcist.googledirection.constant.TransportMode
import com.akexorcist.googledirection.model.Direction
import com.example.company.taxiclient.R
import com.example.company.taxiclient.animation.MapAnimation
import com.example.company.taxiclient.animation.MapUtils
import com.example.company.taxiclient.data.MapRequestData
import com.example.company.taxiclient.services.GoogleDirectionProvider

import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.*
import com.google.android.gms.maps.model.LatLng

import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.fragment_map.*

class MapFragment : Fragment(), OnMapReadyCallback {

    companion object {

        private const val ANIMATION_SPEED = 3000.toLong()
        private const val TRANSPORT_MODE = TransportMode.DRIVING

        enum class AnimationSteps {
            STEP_SEARCHING,
            STEP_DRIVER_ON_THE_WAY_TO_CLIENT,
            STEP_DRIVER_IS_WAITING_CLIENT,
            STEP_CLIENT_DRIVING_TO_DESTINATION_POINT,
            STEP_ORDER_IS_COMPLETED
        }
    }

    val animationStepsObservable: PublishSubject<AnimationSteps> = PublishSubject.create()

    private lateinit var GOOGLE_DIRECTION_API: String
    private lateinit var mapRequestData: MapRequestData
    private lateinit var googleDirectionProvider: GoogleDirectionProvider
    private lateinit var searchRipplesAnimationFirst: ValueAnimator
    private lateinit var searchRipplesAnimationSecond: ValueAnimator
    private lateinit var searchRipplesAnimationThird: ValueAnimator
    private lateinit var map: GoogleMap
    private lateinit var mapAnimation: MapAnimation

    private var searchStatus: Boolean = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_map, container, false)

        val orderButton: Button? = view.findViewById(R.id.start_cardview_btn)
        orderButton?.setOnClickListener { v: View -> orderButtonClicked(v) }

        val cancelButton: Button? = view.findViewById(R.id.cancel_btn)
        cancelButton?.setOnClickListener { v: View -> cancelButtonClicked(v) }

        val mapFragment = this.childFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        return view
    }

    override fun onMapReady(map: GoogleMap) {

        GOOGLE_DIRECTION_API = resources.getString(R.string.google_directions_key)

        mapInit(map)
    }

    private fun setDriveInfo(start: LatLng, end: LatLng, from: String, to: String) {

        from_text.text = getString(R.string.complex_from_text, resources.getString(R.string.from_word), from)
        to_text.text = getString(R.string.complex_to_text, resources.getString(R.string.to_word), to)

        googleDirectionProvider.execute(start, end, TRANSPORT_MODE, object : DirectionCallback {

            override fun onDirectionSuccess(direction: Direction, rawBody: String) {
                if (direction.isOK) {
                    val routeLegList = direction.routeList[0].getLegList().get(0)
                    duration.text = getString(R.string.complex_duration_text,
                            resources.getString(R.string.duration_word), routeLegList.duration.text)
                    distance.text = getString(R.string.complex_distance_text,
                            resources.getString(R.string.distance_word), routeLegList.distance.text)
                   /* val costValue = (routeLegList.distance.value.toInt() * 0.01).toString()
                    cost.text = getString(R.string.complex_cost_text,
                            resources.getString(R.string.cost), costValue)*/
                } else if (direction.status == RequestResult.NOT_FOUND) {
                }
            }

            override fun onDirectionFailure(t: Throwable) {}
        })
    }

    var startCardViewCancelableCallback: GoogleMap.CancelableCallback = object : GoogleMap.CancelableCallback {

        override fun onCancel() {
            Handler().postDelayed({
                start_cardview.visibility = View.VISIBLE
            }, 3000)
        }

        override fun onFinish() {
            onCancel()
        }
    }

    private fun mapInit(map: GoogleMap) {

        /*********** INIT DATA **************/
        val bundle = Bundle()
        bundle.putBoolean("searchStatus", true)

        bundle.putString("from", "ТРК ТАНДЕМ")
        bundle.putString("to", "Олимп")
        bundle.putDouble("fromLat", 55.829977)
        bundle.putDouble("fromLng", 49.117964)
        bundle.putDouble("toLat", 55.819764)
        bundle.putDouble("toLng", 49.140729)

        bundle.putString("comfortClass", "Средний комфорт")
        bundle.putString("seats", "Премиум")
        this.setArguments(bundle)

        //mapRequestData = MapRequestData("Park house", "Olymp", parkHouse, olymp)

        /*************** END INIT DATA *************/


        this.map = map
        googleDirectionProvider = GoogleDirectionProvider(GOOGLE_DIRECTION_API)

        if (!searchStatus) {

            searchStatus = arguments!!.getBoolean("searchStatus")

            mapRequestData = MapRequestData(
                    arguments!!.getString("from"),
                    arguments!!.getString("to"),
                    LatLng(arguments!!.getDouble("fromLat"), arguments!!.getDouble("fromLng")),
                    LatLng(arguments!!.getDouble("toLat"), arguments!!.getDouble("toLng")))

            setDriveInfo(mapRequestData.start, mapRequestData.end, mapRequestData.from, mapRequestData.to)

            mapAnimation = MapAnimation(map, googleDirectionProvider, activity, mapRequestData)
            mapAnimation.final_cardview = view!!.findViewById(R.id.final_cardview)

            val handler = Handler()
            handler.post({
                animationStepsObservable.onNext(AnimationSteps.STEP_SEARCHING)
            })

            animationStepsObservable.subscribe {

                when (it) {

                    AnimationSteps.STEP_SEARCHING -> {

                        handler.postDelayed({

                            Toast.makeText(activity, resources.getString(R.string.searching_toast), Toast.LENGTH_SHORT).show()

                            mapAnimation.showRouteBetweenTwoPoints(mapRequestData.start, mapRequestData.end, TRANSPORT_MODE, startCardViewCancelableCallback)

                            //animationStepsObservable.onNext(AnimationSteps.STEP_DRIVER_ON_THE_WAY_TO_CLIENT)
                        }, ANIMATION_SPEED)
                    }

                    AnimationSteps.STEP_DRIVER_ON_THE_WAY_TO_CLIENT -> {

                        handler.postDelayed({

                            drive_info_bottom_cardview.visibility = View.INVISIBLE
                            drive_info_top_cardview.visibility = View.INVISIBLE

                            Toast.makeText(activity, resources.getString(R.string.driver_road_toast), Toast.LENGTH_SHORT).show()

                            searchRipplesAnimationFirst = mapAnimation.showSearchRipplesVisualization(mapRequestData.start, 3000)
                            searchRipplesAnimationFirst.start()
                            handler.postDelayed({
                                searchRipplesAnimationSecond = mapAnimation.showSearchRipplesVisualization(mapRequestData.start, 3000)
                                searchRipplesAnimationSecond.start()
                            }, 1000)
                            handler.postDelayed({
                                searchRipplesAnimationThird = mapAnimation.showSearchRipplesVisualization(mapRequestData.start, 3000)
                                searchRipplesAnimationThird.start()
                            }, 2000)


                            val nearestMarkerToCenter = MapUtils.getRandomLocation(mapRequestData.start, 1000)
                            val driverName = "Vasiliy E.U"
                            val automobileModel = "VW Polo 1.4"
                            val driverMarker = map.addMarker(MarkerOptions()
                                    .position(nearestMarkerToCenter)
                                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.taxi_marker))
                                    .title(driverName)
                                    .snippet(automobileModel))
                            driverMarker.showInfoWindow()

                            handler.postDelayed({

                                mapAnimation.animateMarker(driverMarker, mapRequestData.start, false, 5000, map, {
                                    animationStepsObservable.onNext(AnimationSteps.STEP_DRIVER_IS_WAITING_CLIENT)
                                    drive_info_bottom_cardview.visibility = View.VISIBLE
                                    drive_info_top_cardview.visibility = View.VISIBLE
                                })
                            }, ANIMATION_SPEED)
                        }, ANIMATION_SPEED)
                    }

                    AnimationSteps.STEP_DRIVER_IS_WAITING_CLIENT -> {

                        handler.postDelayed({

                            Toast.makeText(activity, resources.getString(R.string.waiting_taxi_toast), Toast.LENGTH_SHORT).show()

                            searchRipplesAnimationFirst.end()
                            searchRipplesAnimationSecond.end()
                            searchRipplesAnimationThird.end()

                            animationStepsObservable.onNext(AnimationSteps.STEP_CLIENT_DRIVING_TO_DESTINATION_POINT)
                        }, ANIMATION_SPEED)
                    }

                    AnimationSteps.STEP_CLIENT_DRIVING_TO_DESTINATION_POINT -> {

                        handler.postDelayed({

                            Toast.makeText(activity, resources.getString(R.string.order_progress_toast), Toast.LENGTH_SHORT).show()

                            mapAnimation.animateRouteDrive(mapRequestData.start, mapRequestData.end, TRANSPORT_MODE)

                            animationStepsObservable.onNext(AnimationSteps.STEP_ORDER_IS_COMPLETED)
                        }, ANIMATION_SPEED)
                    }

                    else -> {
                    }
                }
            }
        }
    }

    private fun orderButtonClicked(view: View) {
        start_cardview.visibility = View.INVISIBLE
        animationStepsObservable.onNext(AnimationSteps.STEP_DRIVER_ON_THE_WAY_TO_CLIENT)

    }

    private fun cancelButtonClicked(view: View) {
        val fragment = OrderFirstStepFragment()
        activity!!.supportFragmentManager
                .beginTransaction()
                .replace(R.id.content_frame, fragment)
                .commit()
    }
}