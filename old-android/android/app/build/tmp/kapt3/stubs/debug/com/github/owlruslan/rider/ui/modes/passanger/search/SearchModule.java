package com.github.owlruslan.rider.ui.modes.passanger.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000fH\'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0012H\'\u00a8\u0006\u0013"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchModule;", "", "()V", "mapActivity", "Landroid/app/Activity;", "activity", "Lcom/github/owlruslan/rider/ui/MainActivity;", "mapFragment", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchFragment;", "mapPresenter", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchContract$Presenter;", "presenter", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchPresenter;", "mapService", "Lcom/github/owlruslan/rider/services/map/Map;", "Lcom/github/owlruslan/rider/services/map/MapService;", "placesService", "Lcom/github/owlruslan/rider/services/places/IPlaces;", "Lcom/github/owlruslan/rider/services/places/PlacesService;", "app_debug"})
@dagger.Module()
public abstract class SearchModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.github.owlruslan.rider.di.FragmentScoped()
    public abstract com.github.owlruslan.rider.ui.modes.passanger.search.SearchFragment mapFragment();
    
    @org.jetbrains.annotations.NotNull()
    @com.github.owlruslan.rider.di.ActivityScoped()
    @dagger.Binds()
    public abstract com.github.owlruslan.rider.ui.modes.passanger.search.SearchContract.Presenter mapPresenter(@org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.ui.modes.passanger.search.SearchPresenter presenter);
    
    @org.jetbrains.annotations.NotNull()
    @com.github.owlruslan.rider.di.ActivityScoped()
    @dagger.Binds()
    public abstract com.github.owlruslan.rider.services.map.Map mapService(@org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.services.map.MapService mapService);
    
    @org.jetbrains.annotations.NotNull()
    @com.github.owlruslan.rider.di.ActivityScoped()
    @dagger.Binds()
    public abstract com.github.owlruslan.rider.services.places.IPlaces placesService(@org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.services.places.PlacesService placesService);
    
    @org.jetbrains.annotations.NotNull()
    @com.github.owlruslan.rider.di.ActivityScoped()
    @dagger.Binds()
    public abstract android.app.Activity mapActivity(@org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.ui.MainActivity activity);
    
    public SearchModule() {
        super();
    }
}