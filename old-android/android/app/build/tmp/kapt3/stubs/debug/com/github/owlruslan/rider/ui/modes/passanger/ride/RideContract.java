package com.github.owlruslan.rider.ui.modes.passanger.ride;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/ride/RideContract;", "", "Presenter", "View", "app_debug"})
public abstract interface RideContract {
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0004H&J \u0010\u000b\u001a\u00020\u00042\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH&\u00a8\u0006\u0010"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/ride/RideContract$View;", "Lcom/github/owlruslan/rider/ui/base/BaseView;", "Lcom/github/owlruslan/rider/ui/modes/passanger/ride/RideContract$Presenter;", "createMapboxInstance", "", "hideTopNavigationBar", "showFragment", "fragment", "Landroidx/fragment/app/Fragment;", "showMapView", "showSearchAnimation", "showViewPager", "data", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static abstract interface View extends com.github.owlruslan.rider.ui.base.BaseView<com.github.owlruslan.rider.ui.modes.passanger.ride.RideContract.Presenter> {
        
        public abstract void showFragment(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment);
        
        public abstract void showViewPager(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> data);
        
        public abstract void createMapboxInstance();
        
        public abstract void hideTopNavigationBar();
        
        public abstract void showSearchAnimation();
        
        public abstract void showMapView();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0004H&J\b\u0010\u000b\u001a\u00020\u0004H&\u00a8\u0006\f"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/ride/RideContract$Presenter;", "Lcom/github/owlruslan/rider/ui/base/BasePresenter;", "Lcom/github/owlruslan/rider/ui/modes/passanger/ride/RideContract$View;", "addSearchAnimation", "", "addViewPager", "goToFragment", "fragment", "Landroidx/fragment/app/Fragment;", "initMapbox", "removeTopNavigationBar", "setupMapView", "app_debug"})
    public static abstract interface Presenter extends com.github.owlruslan.rider.ui.base.BasePresenter<com.github.owlruslan.rider.ui.modes.passanger.ride.RideContract.View> {
        
        public abstract void goToFragment(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment);
        
        public abstract void addViewPager();
        
        public abstract void initMapbox();
        
        public abstract void removeTopNavigationBar();
        
        public abstract void addSearchAnimation();
        
        public abstract void setupMapView();
    }
}