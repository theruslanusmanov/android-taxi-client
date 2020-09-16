package com.github.owlruslan.rider.ui.modes.driver.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/driver/search/SearchDriverModule;", "", "()V", "searchFragment", "Lcom/github/owlruslan/rider/ui/modes/driver/search/SearchDriverFragment;", "searchPresenter", "Lcom/github/owlruslan/rider/ui/modes/driver/search/SearchDriverContract$Presenter;", "driverPresenter", "Lcom/github/owlruslan/rider/ui/modes/driver/search/SearchDriverPresenter;", "app_debug"})
@dagger.Module()
public abstract class SearchDriverModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.github.owlruslan.rider.di.FragmentScoped()
    public abstract com.github.owlruslan.rider.ui.modes.driver.search.SearchDriverFragment searchFragment();
    
    @org.jetbrains.annotations.NotNull()
    @com.github.owlruslan.rider.di.ActivityScoped()
    @dagger.Binds()
    public abstract com.github.owlruslan.rider.ui.modes.driver.search.SearchDriverContract.Presenter searchPresenter(@org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.ui.modes.driver.search.SearchDriverPresenter driverPresenter);
    
    public SearchDriverModule() {
        super();
    }
}