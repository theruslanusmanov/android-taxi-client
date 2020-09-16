package com.github.owlruslan.rider.services.places

import android.content.Context
import com.github.owlruslan.rider.R
import com.github.owlruslan.rider.di.ActivityScoped
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.net.PlacesClient
import javax.inject.Inject

@ActivityScoped
class PlacesService @Inject constructor() : IPlaces {
    private lateinit var placesClient: PlacesClient

    @Inject
    lateinit var context: Context

    fun getPlacesClient(): PlacesClient {
        return placesClient
    }

    override fun init() {
        if (!Places.isInitialized()) {
            Places.initialize(context, context.getString(R.string.GOOGLE_MAPS_API_KEY))
            placesClient = Places.createClient(context)
        }
    }
}