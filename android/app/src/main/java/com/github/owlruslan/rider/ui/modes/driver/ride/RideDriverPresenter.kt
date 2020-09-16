package com.github.owlruslan.rider.ui.modes.driver.ride

import com.github.owlruslan.rider.di.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class RideDriverPresenter @Inject constructor() : RideDriverContract.Presenter {

    private var view: RideDriverContract.View? = null

    override fun takeView(view: RideDriverContract.View) { this.view = view; }

    override fun dropView() { view = null }
}