package com.github.owlruslan.rider.ui.modes.passanger.ride;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/ride/RideModule;", "", "()V", "mapboxService", "Lcom/github/owlruslan/rider/services/map/mapbox/Mapbox;", "Lcom/github/owlruslan/rider/services/map/mapbox/MapboxService;", "rideFragment", "Lcom/github/owlruslan/rider/ui/modes/passanger/ride/RideFragment;", "ridePresenter", "Lcom/github/owlruslan/rider/ui/modes/passanger/ride/RideContract$Presenter;", "presenter", "Lcom/github/owlruslan/rider/ui/modes/passanger/ride/RidePresenter;", "app_debug"})
@dagger.Module()
public abstract class RideModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.github.owlruslan.rider.di.FragmentScoped()
    public abstract com.github.owlruslan.rider.ui.modes.passanger.ride.RideFragment rideFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @com.github.owlruslan.rider.di.ActivityScoped()
    public abstract com.github.owlruslan.rider.ui.modes.passanger.ride.RideContract.Presenter ridePresenter(@org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.ui.modes.passanger.ride.RidePresenter presenter);
    
    @org.jetbrains.annotations.NotNull()
    @com.github.owlruslan.rider.di.ActivityScoped()
    @dagger.Binds()
    public abstract com.github.owlruslan.rider.services.map.mapbox.Mapbox mapboxService(@org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.services.map.mapbox.MapboxService mapboxService);
    
    public RideModule() {
        super();
    }
}