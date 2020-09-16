package com.github.owlruslan.rider.ui.modes.passanger.search

import android.widget.LinearLayout
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.transition.Scene
import com.github.owlruslan.rider.ui.base.BasePresenter
import com.github.owlruslan.rider.ui.base.BaseView
import com.google.android.libraries.places.api.model.AutocompletePrediction
import com.google.android.libraries.places.api.model.AutocompleteSessionToken
import com.google.android.libraries.places.api.net.PlacesClient
import com.google.android.material.bottomsheet.BottomSheetBehavior

interface SearchContract {

    interface View : BaseView<Presenter> {

        fun showRideView()

        fun showMenuIcon()

        fun showMap()

        fun initBottomSheet()

        fun showExpandedSearch(view: android.view.View, bottomSheetBehavior: BottomSheetBehavior<LinearLayout>)

        fun showCollapsedSearch(view: android.view.View, bottomSheetBehavior: BottomSheetBehavior<LinearLayout>)

        fun createPlacesInstance()

        fun showSearchList(dataset: ArrayList<AutocompletePrediction>, type: SearchListTypes)

        fun hideQuickPlacesLayout()

        fun showQuickPlacesLayout()

        fun clearFields()
    }

    interface Presenter : BasePresenter<View> {

        fun openRideView()

        fun addMenuIcon()

        fun addMap()

        fun addBottomSheet()

        fun expandSearch(view: android.view.View, bottomSheetBehavior: BottomSheetBehavior<LinearLayout>)

        fun collapseSearch(view: android.view.View, bottomSheetBehavior: BottomSheetBehavior<LinearLayout>)

        fun initPlaces()

        fun addSearchList(dataset: ArrayList<AutocompletePrediction>, type: SearchListTypes)

        fun hideQuickPlaces()

        fun showQuickPlaces()

        fun startSearch(searchText: String, placesClient: PlacesClient, token: AutocompleteSessionToken, type: SearchListTypes)
    }
}