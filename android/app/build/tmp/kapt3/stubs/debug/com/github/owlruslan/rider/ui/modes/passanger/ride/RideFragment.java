package com.github.owlruslan.rider.ui.modes.passanger.ride;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\u001fH\u0016J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u001fH\u0016J\u001a\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u001fH\u0016J\b\u00103\u001a\u00020\u001fH\u0016J\b\u00104\u001a\u00020\u001fH\u0002J \u00105\u001a\u00020\u001f2\u0016\u00106\u001a\u0012\u0012\u0004\u0012\u00020807j\b\u0012\u0004\u0012\u000208`9H\u0016R0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005@GX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0005@GX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000b\u00a8\u0006;"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/ride/RideFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/github/owlruslan/rider/ui/modes/passanger/ride/RideContract$View;", "()V", "<set-?>", "Ldagger/Lazy;", "Lcom/github/owlruslan/rider/ui/modes/passanger/complete/CompleteFragment;", "completeFragmentProvider", "getCompleteFragmentProvider", "()Ldagger/Lazy;", "setCompleteFragmentProvider", "(Ldagger/Lazy;)V", "mapboxMap", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "mapboxService", "Lcom/github/owlruslan/rider/services/map/mapbox/MapboxService;", "getMapboxService", "()Lcom/github/owlruslan/rider/services/map/mapbox/MapboxService;", "setMapboxService", "(Lcom/github/owlruslan/rider/services/map/mapbox/MapboxService;)V", "presenter", "Lcom/github/owlruslan/rider/ui/modes/passanger/ride/RideContract$Presenter;", "getPresenter", "()Lcom/github/owlruslan/rider/ui/modes/passanger/ride/RideContract$Presenter;", "setPresenter", "(Lcom/github/owlruslan/rider/ui/modes/passanger/ride/RideContract$Presenter;)V", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchFragment;", "searchFragmentProvider", "getSearchFragmentProvider", "setSearchFragmentProvider", "animateDrive", "", "style", "Lcom/mapbox/mapboxsdk/maps/Style;", "createMapboxInstance", "hideTopNavigationBar", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "showFragment", "fragment", "Landroidx/fragment/app/Fragment;", "showMapView", "showSearchAnimation", "showTransitionToDriverRequest", "showViewPager", "data", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "Companion", "app_debug"})
@com.github.owlruslan.rider.di.ActivityScoped()
public final class RideFragment extends dagger.android.support.DaggerFragment implements com.github.owlruslan.rider.ui.modes.passanger.ride.RideContract.View {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.github.owlruslan.rider.ui.modes.passanger.ride.RideContract.Presenter presenter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.github.owlruslan.rider.services.map.mapbox.MapboxService mapboxService;
    @org.jetbrains.annotations.NotNull()
    public dagger.Lazy<com.github.owlruslan.rider.ui.modes.passanger.search.SearchFragment> searchFragmentProvider;
    @org.jetbrains.annotations.NotNull()
    public dagger.Lazy<com.github.owlruslan.rider.ui.modes.passanger.complete.CompleteFragment> completeFragmentProvider;
    private com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap;
    private static final double POINT_ZOOM = 16.0;
    public static final double PICKUP_LATITUDE = 55.789607;
    public static final double PICKUP_LONGITUDE = 49.12479;
    private static final com.mapbox.geojson.Point PICKUP_POINT = null;
    public static final double CAR_LATITUDE = 55.789049;
    public static final double CAR_LONGITUDE = 49.124175;
    private static final com.mapbox.geojson.Point CAR_POINT = null;
    public static final double DROPOFF_LATITUDE = 55.796164;
    public static final double DROPOFF_LONGITUDE = 49.125764;
    private static final com.mapbox.geojson.Point DROPOFF_POINT = null;
    private static final java.lang.String MAPBOX_STYLE = "mapbox://styles/mapbox/streets-v11";
    private static final long SEARCH_DELAY_IN_SECONDS = 5L;
    private static final int CAMERA_ANIMATION_TIME = 3000;
    public static final com.github.owlruslan.rider.ui.modes.passanger.ride.RideFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.owlruslan.rider.ui.modes.passanger.ride.RideContract.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.ui.modes.passanger.ride.RideContract.Presenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.owlruslan.rider.services.map.mapbox.MapboxService getMapboxService() {
        return null;
    }
    
    public final void setMapboxService(@org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.services.map.mapbox.MapboxService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.Lazy<com.github.owlruslan.rider.ui.modes.passanger.search.SearchFragment> getSearchFragmentProvider() {
        return null;
    }
    
    @javax.inject.Inject()
    public final void setSearchFragmentProvider(@org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.github.owlruslan.rider.ui.modes.passanger.search.SearchFragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.Lazy<com.github.owlruslan.rider.ui.modes.passanger.complete.CompleteFragment> getCompleteFragmentProvider() {
        return null;
    }
    
    @javax.inject.Inject()
    public final void setCompleteFragmentProvider(@org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.github.owlruslan.rider.ui.modes.passanger.complete.CompleteFragment> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void createMapboxInstance() {
    }
    
    @java.lang.Override()
    public void hideTopNavigationBar() {
    }
    
    @java.lang.Override()
    public void showSearchAnimation() {
    }
    
    private final void showTransitionToDriverRequest() {
    }
    
    @java.lang.Override()
    public void showMapView() {
    }
    
    private final void animateDrive(com.mapbox.mapboxsdk.maps.Style style) {
    }
    
    @java.lang.Override()
    public void showFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
    }
    
    @java.lang.Override()
    public void showViewPager(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> data) {
    }
    
    @javax.inject.Inject()
    public RideFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\n \n*\u0004\u0018\u00010\t0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0015\u001a\n \n*\u0004\u0018\u00010\t0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u000e\u0010\u0017\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/ride/RideFragment$Companion;", "", "()V", "CAMERA_ANIMATION_TIME", "", "CAR_LATITUDE", "", "CAR_LONGITUDE", "CAR_POINT", "Lcom/mapbox/geojson/Point;", "kotlin.jvm.PlatformType", "getCAR_POINT", "()Lcom/mapbox/geojson/Point;", "DROPOFF_LATITUDE", "DROPOFF_LONGITUDE", "DROPOFF_POINT", "getDROPOFF_POINT", "MAPBOX_STYLE", "", "PICKUP_LATITUDE", "PICKUP_LONGITUDE", "PICKUP_POINT", "getPICKUP_POINT", "POINT_ZOOM", "SEARCH_DELAY_IN_SECONDS", "", "app_debug"})
    public static final class Companion {
        
        public final com.mapbox.geojson.Point getPICKUP_POINT() {
            return null;
        }
        
        public final com.mapbox.geojson.Point getCAR_POINT() {
            return null;
        }
        
        public final com.mapbox.geojson.Point getDROPOFF_POINT() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}