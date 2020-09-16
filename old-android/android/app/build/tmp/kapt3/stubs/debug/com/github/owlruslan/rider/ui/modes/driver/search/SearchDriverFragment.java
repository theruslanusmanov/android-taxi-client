package com.github.owlruslan.rider.ui.modes.driver.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0003J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016J\b\u0010 \u001a\u00020\u0013H\u0016J\u0018\u0010!\u001a\u00020\u00132\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0016J\b\u0010%\u001a\u00020\u0013H\u0016J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\'\u001a\u00020\u0013H\u0016J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020*H\u0016J-\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020-2\u000e\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0/2\u0006\u00100\u001a\u000201H\u0016\u00a2\u0006\u0002\u00102J\b\u00103\u001a\u00020\u0013H\u0016J\u0010\u00104\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u0018H\u0016J\b\u00106\u001a\u00020\u0013H\u0016J\b\u00107\u001a\u00020\u0013H\u0016J\u001a\u00108\u001a\u00020\u00132\u0006\u00109\u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006:"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/driver/search/SearchDriverFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/github/owlruslan/rider/ui/modes/driver/search/SearchDriverContract$View;", "Lcom/mapbox/mapboxsdk/maps/OnMapReadyCallback;", "Lcom/mapbox/android/core/permissions/PermissionsListener;", "()V", "mapView", "Lcom/mapbox/mapboxsdk/maps/MapView;", "mapboxMap", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "permissionsManager", "Lcom/mapbox/android/core/permissions/PermissionsManager;", "presenter", "Lcom/github/owlruslan/rider/ui/modes/driver/search/SearchDriverContract$Presenter;", "getPresenter", "()Lcom/github/owlruslan/rider/ui/modes/driver/search/SearchDriverContract$Presenter;", "setPresenter", "(Lcom/github/owlruslan/rider/ui/modes/driver/search/SearchDriverContract$Presenter;)V", "enableLocationComponent", "", "loadedMapStyle", "Lcom/mapbox/mapboxsdk/maps/Style;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onExplanationNeeded", "permissionsToExplain", "", "", "onLowMemory", "onMapReady", "onPause", "onPermissionResult", "granted", "", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "onViewCreated", "view", "app_debug"})
@com.github.owlruslan.rider.di.ActivityScoped()
public final class SearchDriverFragment extends dagger.android.support.DaggerFragment implements com.github.owlruslan.rider.ui.modes.driver.search.SearchDriverContract.View, com.mapbox.mapboxsdk.maps.OnMapReadyCallback, com.mapbox.android.core.permissions.PermissionsListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.github.owlruslan.rider.ui.modes.driver.search.SearchDriverContract.Presenter presenter;
    private com.mapbox.android.core.permissions.PermissionsManager permissionsManager;
    private com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap;
    private com.mapbox.mapboxsdk.maps.MapView mapView;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.owlruslan.rider.ui.modes.driver.search.SearchDriverContract.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.ui.modes.driver.search.SearchDriverContract.Presenter p0) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onLowMemory() {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onExplanationNeeded(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> permissionsToExplain) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void enableLocationComponent(com.mapbox.mapboxsdk.maps.Style loadedMapStyle) {
    }
    
    @java.lang.Override()
    public void onPermissionResult(boolean granted) {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap) {
    }
    
    @javax.inject.Inject()
    public SearchDriverFragment() {
        super();
    }
}