package com.github.owlruslan.rider.ui.modes.passanger.complete

import com.github.owlruslan.rider.ui.modes.passanger.ride.RideContract
import javax.inject.Inject

class CompletePresenter @Inject constructor() : CompleteContract.Presenter {

    private var view: CompleteContract.View? = null

    override fun takeView(view: CompleteContract.View) {
        this.view = view
    }

    override fun dropView() {
        view = null
    }
}