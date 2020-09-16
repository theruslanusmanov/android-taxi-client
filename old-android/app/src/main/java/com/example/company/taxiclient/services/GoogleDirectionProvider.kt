package com.example.company.taxiclient.services

import com.akexorcist.googledirection.DirectionCallback
import com.akexorcist.googledirection.GoogleDirection
import com.google.android.gms.maps.model.LatLng

class GoogleDirectionProvider(val serverKey: String) {

    fun execute(start: LatLng, end: LatLng, transportMode: String, callback: DirectionCallback) {
        GoogleDirection
                .withServerKey(serverKey)
                .from(start)
                .to(end)
                .transportMode(transportMode)
                .execute(callback)
    }
}