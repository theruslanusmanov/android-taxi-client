package com.github.owlruslan.rider.services.map

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.github.owlruslan.rider.di.ActivityScoped
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import javax.inject.Inject

@ActivityScoped
class MapService @Inject constructor() : Map {
    override var locationPermissionGranted: Boolean = false
    override var lastKnownLocation: Location? = null

    @Inject
    lateinit var activity: Activity
    @Inject
    lateinit var context: Context

    private val fusedLocationProviderClient: FusedLocationProviderClient
        get() = LocationServices.getFusedLocationProviderClient(activity)

    override fun getLocationPermission() {
        if (ContextCompat.checkSelfPermission(
                context,
                android.Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            locationPermissionGranted = true
        } else {
            ActivityCompat.requestPermissions(
                activity,
                arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),
                PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION
            )
        }
    }

    override fun updateLocationUI(map: GoogleMap) {
        try {
            if (locationPermissionGranted) {
                map.isMyLocationEnabled = true
                map.uiSettings.isMyLocationButtonEnabled = true
            } else {
                map.isMyLocationEnabled = false
                map.uiSettings.isMyLocationButtonEnabled = false
                lastKnownLocation = null
                getLocationPermission()
            }
        } catch (e: SecurityException) {
            Log.e("Exception: %s", e.message);
        }
    }

    override fun getDeviceLocation(map: GoogleMap) {
        try {
            if (locationPermissionGranted) {
                val locationResult = fusedLocationProviderClient.lastLocation
                locationResult.addOnCompleteListener {
                    if (it.isSuccessful) {
                        // Set the map's camera position to the current location of the device.
                        lastKnownLocation = it.result!!
                        map.moveCamera(
                            CameraUpdateFactory.newLatLngZoom(
                                LatLng(
                                    lastKnownLocation!!.latitude,
                                    lastKnownLocation!!.longitude
                                ), DEFAULT_ZOOM
                            )
                        )
                    } else {
                        Log.d(TAG, "Current location is null. Using defaults.");
                        Log.e(TAG, "Exception: %s", it.exception)
                        map.moveCamera(
                            CameraUpdateFactory.newLatLngZoom(
                                defaultLocation,
                                DEFAULT_ZOOM
                            )
                        )
                        map.uiSettings.isMyLocationButtonEnabled = false
                    }
                }
            }
        } catch (e: SecurityException) {
            Log.e("Exception: %s", e.message);
        }
    }

    companion object {
        private const val TAG = "MapService"
        const val PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1
        const val DEFAULT_ZOOM = 15F
        // A default location (Sydney, Australia) and default zoom to use when location permission is not granted.
        private val defaultLocation = LatLng(44.8523341, 44.2106085)
    }
}