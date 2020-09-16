package com.example.company.taxiclient.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

import com.example.company.taxiclient.R
import com.example.company.taxiclient.data.PlaceAutocompleteFragmentData
import com.google.android.gms.common.api.Status
import com.google.android.gms.location.places.Place
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment
import com.google.android.gms.location.places.ui.PlaceSelectionListener

class OrderFirstStepFragment : Fragment() {

    lateinit var placeAutocompleteFragmentFrom: PlaceAutocompleteFragment
    lateinit var placeAutocompleteFragmentTo: PlaceAutocompleteFragment

    lateinit var fromPlaceAutocompleteFragmentData: PlaceAutocompleteFragmentData
    lateinit var toPlaceAutocompleteFragmentData: PlaceAutocompleteFragmentData

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_order_first_step, container, false)

        val button: Button? = view.findViewById(R.id.nextBtn)
        button?.setOnClickListener { v: View -> buttonClicked(v) }

        initFragments()

        // Inflate the layout for this fragment
        return view
    }

    private fun initFragments() {
        // FROM PlaceAutocompleteFragment
        placeAutocompleteFragmentFrom = PlaceAutocompleteFragment()
        initPlaceAutocompleteFragment(placeAutocompleteFragmentFrom, R.id.placeLayoutFrom, R.string.from_word,
                object : PlaceSelectionListener {
                    override fun onPlaceSelected(place: Place) {
                        fromPlaceAutocompleteFragmentData = PlaceAutocompleteFragmentData(
                                place.name.toString(), place.latLng.latitude, place.latLng.longitude)
                    }

                    override fun onError(status: Status?) {}
                })

        // TO PlaceAutocompleteFragment
        placeAutocompleteFragmentTo = PlaceAutocompleteFragment()
        initPlaceAutocompleteFragment(placeAutocompleteFragmentTo, R.id.placeLayoutTo, R.string.to_word,
                object : PlaceSelectionListener {

                    override fun onPlaceSelected(place: Place) {
                        toPlaceAutocompleteFragmentData = PlaceAutocompleteFragmentData(
                                place.name.toString(), place.latLng.latitude, place.latLng.longitude)
                    }

                    override fun onError(status: Status?) {}
                })
    }

    private fun initPlaceAutocompleteFragment(fragment: PlaceAutocompleteFragment, fragmentId: Int, stringId: Int,
                                              callback: PlaceSelectionListener) {
        fragment.setOnPlaceSelectedListener(callback)
        activity!!.fragmentManager.beginTransaction().replace(fragmentId, fragment).commit()
    }

    private fun makeMapRequestBundle(): Bundle {
        val bundle = Bundle()

        bundle.putString("from", fromPlaceAutocompleteFragmentData.input)
        bundle.putDouble("fromLat", fromPlaceAutocompleteFragmentData.latitude)
        bundle.putDouble("fromLng", fromPlaceAutocompleteFragmentData.longitude)

        bundle.putString("to", toPlaceAutocompleteFragmentData.input)
        bundle.putDouble("toLat", toPlaceAutocompleteFragmentData.latitude)
        bundle.putDouble("toLng", toPlaceAutocompleteFragmentData.longitude)
        return bundle
    }

    private fun buttonClicked(view: View) {
        val secondFragment = OrderSecondStepFragment()
        secondFragment.setArguments(makeMapRequestBundle())
        activity!!.supportFragmentManager
                .beginTransaction()
                .replace(R.id.content_frame, secondFragment)
                .commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        val fragment = OrderFirstStepFragment()
        activity!!.supportFragmentManager.beginTransaction().remove(fragment).commit()
    }
}
