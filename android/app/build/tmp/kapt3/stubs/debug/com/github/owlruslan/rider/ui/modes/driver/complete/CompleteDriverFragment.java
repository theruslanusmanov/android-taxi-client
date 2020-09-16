package com.github.owlruslan.rider.ui.modes.driver.complete;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/driver/complete/CompleteDriverFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/github/owlruslan/rider/ui/modes/driver/complete/CompleteDriverContract$View;", "Lcom/mapbox/mapboxsdk/maps/OnMapReadyCallback;", "()V", "presenter", "Lcom/github/owlruslan/rider/ui/modes/driver/complete/CompleteDriverContract$Presenter;", "getPresenter", "()Lcom/github/owlruslan/rider/ui/modes/driver/complete/CompleteDriverContract$Presenter;", "setPresenter", "(Lcom/github/owlruslan/rider/ui/modes/driver/complete/CompleteDriverContract$Presenter;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onMapReady", "mapboxMap", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "app_debug"})
@com.github.owlruslan.rider.di.ActivityScoped()
public final class CompleteDriverFragment extends dagger.android.support.DaggerFragment implements com.github.owlruslan.rider.ui.modes.driver.complete.CompleteDriverContract.View, com.mapbox.mapboxsdk.maps.OnMapReadyCallback {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.github.owlruslan.rider.ui.modes.driver.complete.CompleteDriverContract.Presenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.owlruslan.rider.ui.modes.driver.complete.CompleteDriverContract.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.ui.modes.driver.complete.CompleteDriverContract.Presenter p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
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
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap) {
    }
    
    @javax.inject.Inject()
    public CompleteDriverFragment() {
        super();
    }
}