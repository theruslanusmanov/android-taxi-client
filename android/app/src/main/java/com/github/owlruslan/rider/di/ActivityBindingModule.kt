package com.github.owlruslan.rider.di

import com.github.owlruslan.rider.ui.MainActivity
import com.github.owlruslan.rider.ui.modes.driver.complete.CompleteDriverModule
import com.github.owlruslan.rider.ui.modes.driver.ride.RideDriverModule
import com.github.owlruslan.rider.ui.modes.driver.search.SearchDriverModule
import com.github.owlruslan.rider.ui.modes.passanger.complete.CompleteModule
import com.github.owlruslan.rider.ui.modes.passanger.search.SearchModule
import com.github.owlruslan.rider.ui.modes.passanger.ride.RideModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * We want Dagger.Android to create a Subcomponent which has a parent Component of whichever module ActivityBindingModule is on,
 * in our case that will be AppComponent. The beautiful part about this setup is that you never need to tell AppComponent that it is going to have all these subcomponents
 * nor do you need to tell these subcomponents that AppComponent exists.
 * We are also telling Dagger.Android that this generated SubComponent needs to include the specified modules and be aware of a scope annotation @ActivityScoped
 * When Dagger.Android annotation processor runs it will create 4 subcomponents for us.
 */
@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(
        modules = [
            SearchModule::class,
            RideModule::class,
            CompleteModule::class,
            SearchDriverModule::class,
            RideDriverModule::class,
            CompleteDriverModule::class
        ]
    )
    abstract fun mainActivity(): MainActivity
}
