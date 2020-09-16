package com.github.owlruslan.rider.ui.modes.driver.complete

import com.github.owlruslan.rider.di.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class CompleteDriverPresenter @Inject constructor() : CompleteDriverContract.Presenter {

    private var view: CompleteDriverContract.View? = null

    override fun takeView(view: CompleteDriverContract.View) { this.view = view; }

    override fun dropView() { view = null }
}