package com.github.owlruslan.rider.ui.modes.passanger.complete

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.owlruslan.rider.R
import com.github.owlruslan.rider.di.ActivityScoped
import dagger.android.support.DaggerFragment
import javax.inject.Inject

@ActivityScoped
class CompleteFragment @Inject constructor() : DaggerFragment(), CompleteContract.View {

    @Inject
    lateinit var presenter: CompleteContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.takeView(this)
    }

    override fun onDestroyView() {
        presenter.dropView()  // prevent leaking activity in
        super.onDestroyView()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_passanger_complete, container, false)
    }
}