package com.github.owlruslan.rider.services.places;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\f\u001a\u00020\rH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/github/owlruslan/rider/services/places/PlacesService;", "Lcom/github/owlruslan/rider/services/places/IPlaces;", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "placesClient", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "getPlacesClient", "init", "", "app_debug"})
@com.github.owlruslan.rider.di.ActivityScoped()
public final class PlacesService implements com.github.owlruslan.rider.services.places.IPlaces {
    private com.google.android.libraries.places.api.net.PlacesClient placesClient;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.content.Context context;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.libraries.places.api.net.PlacesClient getPlacesClient() {
        return null;
    }
    
    @java.lang.Override()
    public void init() {
    }
    
    @javax.inject.Inject()
    public PlacesService() {
        super();
    }
}