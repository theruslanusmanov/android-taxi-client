package com.example.company.taxiclient.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast

import com.example.company.taxiclient.R
import com.example.company.taxiclient.data.PlaceAutocompleteFragmentData
import kotlinx.android.synthetic.main.fragment_order_third_step.*
import android.widget.CompoundButton



class OrderThirdStepFragment : Fragment() {

    lateinit var fromPlaceAutocompleteFragmentData: PlaceAutocompleteFragmentData
    lateinit var toPlaceAutocompleteFragmentData: PlaceAutocompleteFragmentData
    var comfortClass: Int? = null
    var seatsAdult: Int? = null
    var seatsChild: Int? = null
    var babyChairExists: Boolean = true

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_order_third_step, container, false)

        val button: Button? = view.findViewById(R.id.orderBtn)
        button?.setOnClickListener { v: View -> buttonClicked(v) }
        // Inflate the layout for this fragment
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        seatsgroupAdult.setOnCheckedChangeListener { group, checkedId ->
            // This will get the radiobutton that has changed in its check state
            val checkedRadioButton = group.findViewById(checkedId) as RadioButton
            // This puts the value (true/false) into the variable
            val isChecked = checkedRadioButton.isChecked
            // If the radiobutton that has changed in check state is now checked...
            if (isChecked) {
                seatsAdult = checkedRadioButton.id
                // Changes the textview's text to "Checked: example radiobutton text"
                Log.d("CHECK","Checked:" + checkedRadioButton.text)
            }
        }

        seatsgroupChild.setOnCheckedChangeListener { group, checkedId ->
            // This will get the radiobutton that has changed in its check state
            val checkedRadioButton = group.findViewById(checkedId) as RadioButton
            // This puts the value (true/false) into the variable
            val isChecked = checkedRadioButton.isChecked
            // If the radiobutton that has changed in check state is now checked...
            if (isChecked) {
                seatsChild = checkedRadioButton.id
                // Changes the textview's text to "Checked: example radiobutton text"
                Log.d("CHECK","Checked:" + checkedRadioButton.text)
            }
        }

        checkBox.setOnCheckedChangeListener{ button, isChecked ->
            babyChairExists = button.isChecked
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val inputFrom = arguments!!.getString("from")
        val latitudeFrom = arguments!!.getDouble("fromLat")
        val longitudeFrom = arguments!!.getDouble("fromLng")
        fromPlaceAutocompleteFragmentData = PlaceAutocompleteFragmentData(inputFrom, latitudeFrom, longitudeFrom)

        val inputTo = arguments!!.getString("to")
        val latitudeTo = arguments!!.getDouble("toLat")
        val longitudeTo = arguments!!.getDouble("toLng")
        toPlaceAutocompleteFragmentData = PlaceAutocompleteFragmentData(inputTo, latitudeTo, longitudeTo)

        comfortClass = arguments!!.getInt("comfortClass")

    }

    private fun makeMapRequestBundle(): Bundle {
        val bundle = Bundle()
        bundle.putBoolean("searchStatus", true)

        bundle.putString("from", fromPlaceAutocompleteFragmentData.input)
        bundle.putDouble("fromLat", fromPlaceAutocompleteFragmentData.latitude)
        bundle.putDouble("fromLng", fromPlaceAutocompleteFragmentData.longitude)

        bundle.putString("to", toPlaceAutocompleteFragmentData.input)
        bundle.putDouble("toLat", toPlaceAutocompleteFragmentData.latitude)
        bundle.putDouble("toLng", toPlaceAutocompleteFragmentData.longitude)

        bundle.putInt("comfortClass", comfortClass!!)
        bundle.putBoolean("babyChairExists", babyChairExists)

        if (babyChairExists) {
            seatsAdult = seatsAdult ?: radioButton1.id
            seatsChild = seatsChild ?: radioButtonChild1.id

            bundle.putInt("seatsAdult", seatsAdult!!)
            bundle.putInt("seatsChild", seatsChild!!)
        }

        return bundle
    }

    private fun buttonClicked(view: View) {
        //Toast.makeText(view.context, "Sending...", Toast.LENGTH_SHORT).show()

        val mapFragment = MapFragment()
        mapFragment.setArguments(makeMapRequestBundle())
        activity!!.supportFragmentManager
                .beginTransaction()
                .replace(R.id.content_frame, mapFragment)
                .commit()
    }
}
