package com.github.owlruslan.rider.services.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u000fH&J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/github/owlruslan/rider/services/map/Map;", "", "lastKnownLocation", "Landroid/location/Location;", "getLastKnownLocation", "()Landroid/location/Location;", "setLastKnownLocation", "(Landroid/location/Location;)V", "locationPermissionGranted", "", "getLocationPermissionGranted", "()Z", "setLocationPermissionGranted", "(Z)V", "getDeviceLocation", "", "map", "Lcom/google/android/gms/maps/GoogleMap;", "getLocationPermission", "updateLocationUI", "app_debug"})
public abstract interface Map {
    
    public abstract boolean getLocationPermissionGranted();
    
    public abstract void setLocationPermissionGranted(boolean p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract android.location.Location getLastKnownLocation();
    
    public abstract void setLastKnownLocation(@org.jetbrains.annotations.Nullable()
    android.location.Location p0);
    
    public abstract void getLocationPermission();
    
    public abstract void updateLocationUI(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap map);
    
    public abstract void getDeviceLocation(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap map);
}