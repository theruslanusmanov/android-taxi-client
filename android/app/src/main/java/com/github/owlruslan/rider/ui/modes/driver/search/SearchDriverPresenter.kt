package com.github.owlruslan.rider.ui.modes.driver.search

import com.github.owlruslan.rider.di.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class SearchDriverPresenter @Inject constructor() : SearchDriverContract.Presenter {

    private var view: SearchDriverContract.View? = null

    override fun takeView(view: SearchDriverContract.View) { this.view = view; }

    override fun dropView() { view = null }
}