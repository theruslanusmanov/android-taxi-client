package com.github.owlruslan.rider.ui.modes.driver.ride

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.owlruslan.rider.R
import com.github.owlruslan.rider.di.ActivityScoped
import com.mapbox.mapboxsdk.Mapbox
import com.mapbox.mapboxsdk.maps.MapboxMap
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback
import dagger.android.support.DaggerFragment
import javax.inject.Inject

@ActivityScoped
class RideDriverFragment @Inject constructor() : DaggerFragment(), RideDriverContract.View, OnMapReadyCallback {

    @Inject
    lateinit var presenter: RideDriverContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.takeView(this)

        // Mapbox access token is configured here. This needs to be called either in your application
        // object or in the same activity which contains the mapview.
        Mapbox.getInstance(requireContext(), getString(R.string.mapbox_access_token));
    }

    override fun onDestroy() {
        presenter.dropView()  // prevent leaking activity in
        super.onDestroy()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_driver_ride, container, false)
    }

    override fun onMapReady(mapboxMap: MapboxMap) {

    }
}