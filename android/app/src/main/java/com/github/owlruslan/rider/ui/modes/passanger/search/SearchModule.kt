package com.github.owlruslan.rider.ui.modes.passanger.search

import android.app.Activity
import com.github.owlruslan.rider.di.ActivityScoped
import com.github.owlruslan.rider.di.FragmentScoped
import com.github.owlruslan.rider.services.places.IPlaces
import com.github.owlruslan.rider.services.map.Map
import com.github.owlruslan.rider.services.map.MapService
import com.github.owlruslan.rider.services.places.PlacesService
import com.github.owlruslan.rider.ui.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SearchModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun mapFragment(): SearchFragment

    @Binds
    @ActivityScoped
    abstract fun mapPresenter(presenter: SearchPresenter): SearchContract.Presenter

    @Binds
    @ActivityScoped
    abstract fun mapService(mapService: MapService): Map

    @Binds
    @ActivityScoped
    abstract fun placesService(placesService: PlacesService): IPlaces

    @Binds
    @ActivityScoped
    abstract fun mapActivity(activity: MainActivity): Activity
}
