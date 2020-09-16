package com.github.owlruslan.rider.ui.modes.driver.complete

import com.github.owlruslan.rider.di.ActivityScoped
import com.github.owlruslan.rider.di.FragmentScoped
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class CompleteDriverModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun completeFragment(): CompleteDriverFragment

    @Binds
    @ActivityScoped
    abstract fun completePresenter(driverPresenter: CompleteDriverPresenter): CompleteDriverContract.Presenter
}