package com.github.owlruslan.rider.ui.modes.driver.search

import com.github.owlruslan.rider.ui.base.BasePresenter
import com.github.owlruslan.rider.ui.base.BaseView
import com.github.owlruslan.rider.ui.modes.passanger.search.SearchContract

interface SearchDriverContract {

    interface  View : BaseView<SearchContract.Presenter> {}

    interface Presenter : BasePresenter<View> {}
}