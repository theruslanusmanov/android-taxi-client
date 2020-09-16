package com.github.owlruslan.rider.services.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020 H\u0016J\u0010\u0010$\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006&"}, d2 = {"Lcom/github/owlruslan/rider/services/map/MapService;", "Lcom/github/owlruslan/rider/services/map/Map;", "()V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getFusedLocationProviderClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "lastKnownLocation", "Landroid/location/Location;", "getLastKnownLocation", "()Landroid/location/Location;", "setLastKnownLocation", "(Landroid/location/Location;)V", "locationPermissionGranted", "", "getLocationPermissionGranted", "()Z", "setLocationPermissionGranted", "(Z)V", "getDeviceLocation", "", "map", "Lcom/google/android/gms/maps/GoogleMap;", "getLocationPermission", "updateLocationUI", "Companion", "app_debug"})
@com.github.owlruslan.rider.di.ActivityScoped()
public final class MapService implements com.github.owlruslan.rider.services.map.Map {
    private boolean locationPermissionGranted = false;
    @org.jetbrains.annotations.Nullable()
    private android.location.Location lastKnownLocation;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.app.Activity activity;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.content.Context context;
    private static final java.lang.String TAG = "MapService";
    public static final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1;
    public static final float DEFAULT_ZOOM = 15.0F;
    private static final com.google.android.gms.maps.model.LatLng defaultLocation = null;
    public static final com.github.owlruslan.rider.services.map.MapService.Companion Companion = null;
    
    @java.lang.Override()
    public boolean getLocationPermissionGranted() {
        return false;
    }
    
    @java.lang.Override()
    public void setLocationPermissionGranted(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.location.Location getLastKnownLocation() {
        return null;
    }
    
    @java.lang.Override()
    public void setLastKnownLocation(@org.jetbrains.annotations.Nullable()
    android.location.Location p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    public final void setActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    private final com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient() {
        return null;
    }
    
    @java.lang.Override()
    public void getLocationPermission() {
    }
    
    @java.lang.Override()
    public void updateLocationUI(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap map) {
    }
    
    @java.lang.Override()
    public void getDeviceLocation(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap map) {
    }
    
    @javax.inject.Inject()
    public MapService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/github/owlruslan/rider/services/map/MapService$Companion;", "", "()V", "DEFAULT_ZOOM", "", "PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION", "", "TAG", "", "defaultLocation", "Lcom/google/android/gms/maps/model/LatLng;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}