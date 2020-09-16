package com.github.owlruslan.rider.ui.modes.passanger.search

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.os.Bundle
import android.preference.PreferenceManager
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

import javax.inject.Inject

import androidx.core.view.GravityCompat
import androidx.core.view.updateLayoutParams
import androidx.core.widget.doOnTextChanged
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.transition.*

import com.github.owlruslan.rider.R
import com.github.owlruslan.rider.di.ActivityScoped
import com.github.owlruslan.rider.services.map.Map
import com.github.owlruslan.rider.ui.modes.passanger.ride.RideFragment
import com.github.owlruslan.rider.services.places.PlacesService

import dagger.android.support.DaggerFragment
import dagger.Lazy

import com.google.android.libraries.places.api.model.AutocompletePrediction
import com.google.android.libraries.places.api.model.AutocompleteSessionToken
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.floatingactionbutton.FloatingActionButton

import com.mapbox.android.core.permissions.PermissionsListener
import com.mapbox.android.core.permissions.PermissionsManager
import com.mapbox.mapboxsdk.Mapbox
import com.mapbox.mapboxsdk.location.LocationComponent
import com.mapbox.mapboxsdk.location.modes.CameraMode
import com.mapbox.mapboxsdk.location.modes.RenderMode
import com.mapbox.mapboxsdk.maps.MapView
import com.mapbox.mapboxsdk.maps.MapboxMap
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback
import com.mapbox.mapboxsdk.maps.Style

import kotlinx.android.synthetic.main.fab_my_location.*
import kotlinx.android.synthetic.main.fragment_passenger_search.*
import kotlinx.android.synthetic.main.search_input_expanded.*

@ActivityScoped
class SearchFragment @Inject constructor() : DaggerFragment(), SearchContract.View, OnMapReadyCallback,
    PermissionsListener,
    OnSearchListClickListener {

    @Inject
    lateinit var presenter: SearchContract.Presenter

    @Inject
    lateinit var placesService: PlacesService

    @set:Inject
    var rideFragmentProvider: Lazy<RideFragment>? = null

    lateinit var rootView: View
    lateinit var bottomSheetBehavior: BottomSheetBehavior<LinearLayout>

    private lateinit var startPointTextWatcher: TextWatcher
    private lateinit var endPointTextWatcher: TextWatcher

    var lastSlideOffset = 0f

    private lateinit var permissionsManager: PermissionsManager
    private lateinit var mapboxMap: MapboxMap
    private lateinit var mapView: MapView

    override fun onStart() {
        super.onStart()
        mapView.onStart();
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.takeView(this)
        presenter.initPlaces()

        // Mapbox access token is configured here. This needs to be called either in your application
        // object or in the same activity which contains the mapview.
        Mapbox.getInstance(requireContext(), getString(R.string.mapbox_access_token));
    }

    override fun onDestroy() {
        presenter.dropView()  // prevent leaking activity in
        super.onDestroy()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mapView.onDestroy()
    }

    override fun onResume() {
        super.onResume()
        presenter.initPlaces()
        presenter.collapseSearch(rootView, bottomSheetBehavior)

        mapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onStop() {
        super.onStop()
        mapView.onStop()
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        mapView.onSaveInstanceState(outState)
    }

    override fun onLowMemory() {
        super.onLowMemory()
        if (!mapView.isDestroyed) {
            mapView.onLowMemory();
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_passenger_search, container, false)
        rootView = view
        presenter.addMenuIcon()
        presenter.addMap()
        presenter.addBottomSheet()
        presenter.collapseSearch(rootView, bottomSheetBehavior)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mapView = view.findViewById(R.id.mapView)
        mapView.getMapAsync(this)
    }

    override fun showRideView() {
        val rideFragment = rideFragmentProvider!!.get()
        activity!!.supportFragmentManager.beginTransaction()
            .setCustomAnimations(0, R.anim.slide_in_down)
            .replace(R.id.content_frame, rideFragment)
            .addToBackStack(null)
            .commit()
    }

    override fun showMenuIcon() {
        val drawerLayout = activity!!.findViewById<DrawerLayout>(R.id.drawer_layout)
        val menu = rootView.findViewById<FloatingActionButton>(R.id.menu)
        menu.setOnClickListener { drawerLayout.openDrawer(GravityCompat.START) }
    }

    override fun showMap() {

    }

    override fun initBottomSheet() {
        // Resize map
        val map = rootView.findViewById<LinearLayout>(R.id.mapLayout)
        map.setPadding(0, 0, 0, CARD_VIEW_HEIGHT)

        // Bottom sheet listeners
        val bottomSheetSearchCardView = rootView.findViewById<LinearLayout>(R.id.bottomSheetSearch)
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheetSearchCardView)
        bottomSheetBehavior.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {

            override fun onStateChanged(bottomSheet: View, newState: Int) {
                if (newState == BottomSheetBehavior.STATE_EXPANDED) {
                    presenter.expandSearch(rootView, bottomSheetBehavior)
                } else if (newState == BottomSheetBehavior.STATE_COLLAPSED) {
                    presenter.collapseSearch(rootView, bottomSheetBehavior)
                }
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                if (slideOffset - lastSlideOffset > 0) {
                    // from start to end
                    searchCardView.updateLayoutParams<ViewGroup.LayoutParams> {
                        this.height = (SEARCH_CARD_VIEW_HEIGHT + SEARCH_CARD_VIEW_HEIGHT * slideOffset).toInt()
                    }
                } else {
                    searchCardView.updateLayoutParams<ViewGroup.LayoutParams> {
                        this.height =
                            (SEARCH_CARD_VIEW_HEIGHT * 2 - SEARCH_CARD_VIEW_HEIGHT * (1 - slideOffset)).toInt()
                    }
                }

                val transition = TransitionSet()
                transition.duration = 0

                val headerSceneRoot = rootView.findViewById(R.id.searchHeaderContainer) as ViewGroup
                val headerCollapsedScene =
                    Scene.getSceneForLayout(headerSceneRoot, R.layout.search_header_collapsed, requireContext())
                val headerExpandedScene =
                    Scene.getSceneForLayout(headerSceneRoot, R.layout.search_header_expanded, requireContext())

                val searchInputSceneRoot = rootView.findViewById(R.id.searchInputContainer) as ViewGroup
                val searchInputCollapsedScene =
                    Scene.getSceneForLayout(searchInputSceneRoot, R.layout.search_input_collapsed, requireContext())
                val searchInputExpandedScene =
                    Scene.getSceneForLayout(searchInputSceneRoot, R.layout.search_input_expanded, requireContext())

                if (slideOffset <= 0.5) {
                    searchInputContainer.alpha = 1 - slideOffset * 2
                    searchHeaderContainer.alpha = 1 - slideOffset * 2

                    TransitionManager.go(headerCollapsedScene, transition)
                    TransitionManager.go(searchInputCollapsedScene, transition)
                } else {
                    searchInputContainer.alpha = slideOffset * 2F - 1
                    searchHeaderContainer.alpha = slideOffset * 2F - 1

                    TransitionManager.go(headerExpandedScene, transition)
                    TransitionManager.go(searchInputExpandedScene, transition)
                }

                lastSlideOffset = slideOffset
            }
        })
    }

    override fun showExpandedSearch(
        view: View,
        bottomSheetBehavior: BottomSheetBehavior<LinearLayout>
    ) {
        searchRecyclerView.visibility = View.VISIBLE
        // Cancel button
        val btnClose = view.findViewById<TextView>(R.id.btnClose)
        btnClose.setOnClickListener {
            if (bottomSheetBehavior.state == BottomSheetBehavior.STATE_EXPANDED) {
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
            }
        }

        // Done button
        val btnDone = view.findViewById<TextView>(R.id.btnDone)
        btnDone.setOnClickListener {
            presenter.openRideView()
        }

        // Search
        // Start input
        val inputStartPoint = view.findViewById<TextView>(R.id.inputStartPoint)
        inputStartPoint.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) presenter.hideQuickPlaces()
            else presenter.showQuickPlaces()
        }

        startPointTextWatcher = inputStartPoint.doOnTextChanged { text, _, _, _ ->
            presenter.startSearch(text.toString(), placesService.getPlacesClient(), AUTOCOMPLETE_SESSION_TOKEN, SearchListTypes.START)
        }

        // End input
        val inputEndPoint = view.findViewById<TextView>(R.id.inputEndPoint)
        inputEndPoint.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) presenter.hideQuickPlaces()
            else presenter.showQuickPlaces()
        }

        endPointTextWatcher = inputEndPoint.doOnTextChanged { text, _, _, _ ->
            presenter.startSearch(text.toString(), placesService.getPlacesClient(), AUTOCOMPLETE_SESSION_TOKEN, SearchListTypes.END)
        }
    }

    override fun showCollapsedSearch(view: View, bottomSheetBehavior: BottomSheetBehavior<LinearLayout>) {
        view.findViewById<RecyclerView>(R.id.searchRecyclerView).visibility = View.GONE
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED

        // Expand
        val bottomSheetSearch = view.findViewById<LinearLayout>(R.id.bottomSheetSearch)
        bottomSheetSearch.setOnClickListener {
            if (bottomSheetBehavior.state == BottomSheetBehavior.STATE_COLLAPSED) {
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
            }
        }
    }

    override fun createPlacesInstance() {
        placesService.init()
    }

    override fun showSearchList(dataset: ArrayList<AutocompletePrediction>, type: SearchListTypes) {
        searchRecyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = SearchListAdapter(dataset, this@SearchFragment, type, context)
        }
    }

    override fun hideQuickPlacesLayout() {
        quickPlacesLayout.visibility = View.GONE
    }

    override fun showQuickPlacesLayout() {
        quickPlacesLayout.visibility = View.VISIBLE
    }

    override fun clearFields() {
        searchRecyclerView.adapter = null

        inputStartPoint.onFocusChangeListener = null
        inputEndPoint.onFocusChangeListener = null

        inputStartPoint.removeTextChangedListener(startPointTextWatcher)
        inputEndPoint.removeTextChangedListener(endPointTextWatcher)

        inputStartPoint.text.clear()
        inputEndPoint.text.clear()
    }

    override fun onItemClick(model: AutocompletePrediction, type: SearchListTypes) {
        if (type == SearchListTypes.START) {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            preferences.edit()
                .putString("startPointPlaceId", model.placeId)
                .apply()
        } else {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            preferences.edit()
                .putString("endPointPlaceId", model.placeId)
                .apply()
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        permissionsManager.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    override fun onExplanationNeeded(permissionsToExplain: MutableList<String>?) {
        Toast.makeText(requireContext(), R.string.user_location_permission_explanation, Toast.LENGTH_LONG).show();
    }

    @SuppressLint("MissingPermission")
    private fun enableLocationComponent(loadedMapStyle: Style) {
        // Check if permissions are enabled and if not request
        if (PermissionsManager.areLocationPermissionsGranted(requireContext())) {

            // Get an instance of the component
            val locationComponent: LocationComponent = mapboxMap.locationComponent

            // Activate with options
            locationComponent.activateLocationComponent(requireContext(), loadedMapStyle)

            // Enable to make component visible
            locationComponent.isLocationComponentEnabled = true

            // Set the component's camera mode
            locationComponent.cameraMode = CameraMode.TRACKING

            // Set the component's render mode
            locationComponent.renderMode = RenderMode.COMPASS
        } else {
            permissionsManager = PermissionsManager(this)
            permissionsManager.requestLocationPermissions(requireActivity())
        }
    }

    override fun onPermissionResult(granted: Boolean) {
        if (granted) {
            mapboxMap.getStyle {
                style: Style -> enableLocationComponent(style)
            }
        } else {
            Toast.makeText(requireContext(), R.string.user_location_permission_not_granted, Toast.LENGTH_LONG).show();
            // TODO finish()
        }
    }

    override fun onMapReady(mapboxMap: MapboxMap) {
        this.mapboxMap = mapboxMap
        mapboxMap.setStyle(Style.MAPBOX_STREETS) {
            enableLocationComponent(it)
        }

        fabMyLocation.setOnClickListener {
            mapboxMap.setStyle(Style.MAPBOX_STREETS) {
                enableLocationComponent(it)
            }
        }
    }

    companion object {
        val AUTOCOMPLETE_SESSION_TOKEN = AutocompleteSessionToken.newInstance()
        private const val CARD_VIEW_HEIGHT = 520
        private const val SEARCH_CARD_VIEW_HEIGHT = 96
    }
}
