package com.example.company.taxiclient.data

import com.google.android.gms.maps.model.LatLng

data class MapRequestData(val from: String, val to: String, val start: LatLng, val end: LatLng)