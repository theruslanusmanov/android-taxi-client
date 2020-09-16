package com.github.owlruslan.rider.ui.modes.driver.complete

import com.github.owlruslan.rider.ui.base.BasePresenter
import com.github.owlruslan.rider.ui.base.BaseView

interface CompleteDriverContract {

    interface View : BaseView<Presenter> {}

    interface Presenter : BasePresenter<View> {}
}