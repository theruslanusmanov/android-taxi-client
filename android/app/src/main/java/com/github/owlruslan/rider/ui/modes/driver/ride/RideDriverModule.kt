package com.github.owlruslan.rider.ui.modes.driver.ride

import com.github.owlruslan.rider.di.ActivityScoped
import com.github.owlruslan.rider.di.FragmentScoped
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class RideDriverModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun rideFragment(): RideDriverFragment

    @Binds
    @ActivityScoped
    abstract fun ridePresenter(driverPresenter: RideDriverPresenter): RideDriverContract.Presenter
}