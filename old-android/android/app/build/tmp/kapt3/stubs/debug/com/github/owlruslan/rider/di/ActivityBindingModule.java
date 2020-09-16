package com.github.owlruslan.rider.di;

import java.lang.System;

/**
 * We want Dagger.Android to create a Subcomponent which has a parent Component of whichever module ActivityBindingModule is on,
 * in our case that will be AppComponent. The beautiful part about this setup is that you never need to tell AppComponent that it is going to have all these subcomponents
 * nor do you need to tell these subcomponents that AppComponent exists.
 * We are also telling Dagger.Android that this generated SubComponent needs to include the specified modules and be aware of a scope annotation @ActivityScoped
 * When Dagger.Android annotation processor runs it will create 4 subcomponents for us.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/github/owlruslan/rider/di/ActivityBindingModule;", "", "()V", "mainActivity", "Lcom/github/owlruslan/rider/ui/MainActivity;", "app_debug"})
@dagger.Module()
public abstract class ActivityBindingModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.github.owlruslan.rider.ui.modes.passanger.search.SearchModule.class, com.github.owlruslan.rider.ui.modes.passanger.ride.RideModule.class, com.github.owlruslan.rider.ui.modes.passanger.complete.CompleteModule.class, com.github.owlruslan.rider.ui.modes.driver.search.SearchDriverModule.class, com.github.owlruslan.rider.ui.modes.driver.ride.RideDriverModule.class, com.github.owlruslan.rider.ui.modes.driver.complete.CompleteDriverModule.class})
    @ActivityScoped()
    public abstract com.github.owlruslan.rider.ui.MainActivity mainActivity();
    
    public ActivityBindingModule() {
        super();
    }
}