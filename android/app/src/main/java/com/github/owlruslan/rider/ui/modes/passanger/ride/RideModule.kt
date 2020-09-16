package com.github.owlruslan.rider.ui.modes.passanger.ride

import com.github.owlruslan.rider.di.ActivityScoped
import com.github.owlruslan.rider.di.FragmentScoped
import com.github.owlruslan.rider.services.map.mapbox.Mapbox
import com.github.owlruslan.rider.services.map.mapbox.MapboxService
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class RideModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun rideFragment(): RideFragment

    @ActivityScoped
    @Binds abstract fun ridePresenter(presenter: RidePresenter): RideContract.Presenter

    @Binds
    @ActivityScoped
    abstract fun mapboxService(mapboxService: MapboxService): Mapbox
}