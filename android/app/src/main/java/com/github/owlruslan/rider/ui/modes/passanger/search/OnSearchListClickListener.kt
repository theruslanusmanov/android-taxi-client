package com.github.owlruslan.rider.ui.modes.passanger.search

import com.google.android.libraries.places.api.model.AutocompletePrediction

interface OnSearchListClickListener {
    fun onItemClick(model: AutocompletePrediction, type: SearchListTypes)
}