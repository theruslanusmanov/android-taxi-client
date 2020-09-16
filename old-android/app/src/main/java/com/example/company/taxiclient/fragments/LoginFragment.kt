package com.example.company.taxiclient.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.company.taxiclient.R

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_login, container, false)

        val button: Button = view.findViewById(R.id.buttonLogin)
        button.setOnClickListener { v: View -> buttonClicked(v)}
        // Inflate the layout for this fragment
        return view
    }

    private fun buttonClicked(view: View) {
        Toast.makeText(view.context, "Authentication...!", Toast.LENGTH_SHORT).show();
    }
}
