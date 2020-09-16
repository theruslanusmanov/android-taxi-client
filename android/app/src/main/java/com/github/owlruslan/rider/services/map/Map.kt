package com.github.owlruslan.rider.services.map

import android.location.Location
import com.google.android.gms.maps.GoogleMap

interface Map {
    var locationPermissionGranted: Boolean
    var lastKnownLocation: Location?

    fun getLocationPermission()

    fun updateLocationUI(map: GoogleMap)

    fun getDeviceLocation(map: GoogleMap)
}