package com.github.owlruslan.rider.ui.modes.passanger.ride

import androidx.fragment.app.Fragment
import com.github.owlruslan.rider.ui.base.BasePresenter
import com.github.owlruslan.rider.ui.base.BaseView

interface RideContract {

    interface View : BaseView<Presenter> {

        fun showFragment(fragment: Fragment)

        fun showViewPager(data: ArrayList<String>)

        fun createMapboxInstance()

        fun hideTopNavigationBar()

        fun showSearchAnimation()

        fun showMapView()
    }

    interface Presenter : BasePresenter<View> {

        fun goToFragment(fragment: Fragment)

        fun addViewPager()

        fun initMapbox()

        fun removeTopNavigationBar()

        fun addSearchAnimation()

        fun setupMapView()
    }
}