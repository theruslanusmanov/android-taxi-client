package com.github.owlruslan.rider.ui.modes.passanger.ride

import androidx.fragment.app.Fragment
import javax.inject.Inject

class RidePresenter @Inject constructor() : RideContract.Presenter {

    private var view: RideContract.View? = null

    override fun takeView(view: RideContract.View) {
        this.view = view
    }

    override fun dropView() {
        view = null
    }

    override fun goToFragment(fragment: Fragment) {
        view?.showFragment(fragment)
    }

    override fun addViewPager() {
        val data = ArrayList<String>()
        data.add("Economy")
        data.add("Luxury")

        view?.showViewPager(data)
    }

    override fun initMapbox() {
        view?.createMapboxInstance()
    }

    override fun removeTopNavigationBar() {
        view?.hideTopNavigationBar()
    }

    override fun addSearchAnimation() {
        view?.showSearchAnimation()
    }

    override fun setupMapView() {
        view?.showMapView()
    }
}