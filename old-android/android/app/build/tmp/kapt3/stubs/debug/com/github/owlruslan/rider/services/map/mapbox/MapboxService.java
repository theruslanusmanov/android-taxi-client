package com.github.owlruslan.rider.services.map.mapbox;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001AB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J$\u0010 \u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"H\u0016J \u0010%\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010&\u001a\u00020#2\b\u0010\'\u001a\u0004\u0018\u00010$J\b\u0010(\u001a\u00020\u0014H\u0016J \u0010)\u001a\n **\u0004\u0018\u00010\u00040\u00042\u0006\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020$H\u0002J \u0010-\u001a\u0012\u0012\u0004\u0012\u00020/0.j\b\u0012\u0004\u0012\u00020/`02\u0006\u00101\u001a\u00020\fH\u0002J\u001e\u00102\u001a\n **\u0004\u0018\u00010\f0\f2\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0002J\u0010\u00106\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u00107\u001a\u0002082\f\u00109\u001a\b\u0012\u0004\u0012\u00020/0:H\u0002J\u0010\u0010;\u001a\u00020\u00142\u0006\u00101\u001a\u00020\fH\u0002J \u0010<\u001a\u00020\u00142\u0006\u00101\u001a\u00020\f2\u0006\u0010=\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J \u0010>\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020$H\u0016J\u0010\u0010?\u001a\u00020\u00142\u0006\u0010@\u001a\u00020#H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"}, d2 = {"Lcom/github/owlruslan/rider/services/map/mapbox/MapboxService;", "Lcom/github/owlruslan/rider/services/map/mapbox/Mapbox;", "()V", "client", "Lcom/mapbox/api/directions/v5/MapboxDirections;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "currentRoute", "Lcom/mapbox/api/directions/v5/models/DirectionsRoute;", "getCurrentRoute", "()Lcom/mapbox/api/directions/v5/models/DirectionsRoute;", "setCurrentRoute", "(Lcom/mapbox/api/directions/v5/models/DirectionsRoute;)V", "mapboxMap", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "addImageOfCarIcon", "", "style", "Lcom/mapbox/mapboxsdk/maps/Style;", "addImageOfDropoffIcon", "addImageOfPickupIcon", "addImageOfPulseCircle", "addLayerOfCarIcon", "addLayerOfDropoffIcon", "addLayerOfPickupIcon", "addLayerOfPulseCircle", "addLayerOfRoute", "addMapboxLayers", "addMapboxSources", "points", "Landroidx/collection/ArrayMap;", "", "Lcom/mapbox/geojson/Point;", "addSource", "sourceId", "point", "cancelCall", "createDirectionsClient", "kotlin.jvm.PlatformType", "start", "end", "createRouteLatLngListFromDirectionsRoute", "Ljava/util/ArrayList;", "Lcom/mapbox/mapboxsdk/geometry/LatLng;", "Lkotlin/collections/ArrayList;", "route", "getDirectionsRouteFromResponse", "response", "Lretrofit2/Response;", "Lcom/mapbox/api/directions/v5/models/DirectionsResponse;", "init", "setCameraBoundsWithBottomPadding", "Lcom/mapbox/mapboxsdk/geometry/LatLngBounds;", "routeLatLngList", "", "setCameraToTopOfScreen", "setRouteSource", "routeId", "showRoute", "showToast", "text", "Companion", "app_debug"})
@com.github.owlruslan.rider.di.ActivityScoped()
public final class MapboxService implements com.github.owlruslan.rider.services.map.mapbox.Mapbox {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.content.Context context;
    private com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap;
    @org.jetbrains.annotations.NotNull()
    public com.mapbox.api.directions.v5.models.DirectionsRoute currentRoute;
    private com.mapbox.api.directions.v5.MapboxDirections client;
    private static final java.lang.String ROUTE_LAYER_ID = "route-layer-id";
    private static final java.lang.String ROUTE_SOURCE_ID = "route-source-id";
    private static final java.lang.String PICKUP_ICON_SOURCE_ID = "pickup-icon-source-id";
    private static final java.lang.String PULSE_CIRCLE_SOURCE_ID = "pulse-circle-source-id";
    private static final java.lang.String DROPOFF_ICON_SOURCE_ID = "dropoff-icon-source-id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CAR_ICON_SOURCE_ID = "car-icon-source-id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PICKUP_ICON_LAYER_ID = "pickup-icon-layer-id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PULSE_CIRCLE_LAYER_ID = "pulse-circle-layer-id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DROPOFF_ICON_LAYER_ID = "dropoff-icon-layer-id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CAR_ICON_LAYER_ID = "car-icon-layer-id";
    private static final java.lang.String PICKUP_MARKER_IMAGE_ID = "pickup-marker-image-id";
    private static final java.lang.String PULSE_CIRCLE_IMAGE_ID = "pulse-circle-image-id";
    private static final java.lang.String DROPOFF_MARKER_IMAGE_ID = "dropoff-marker-image-id";
    private static final java.lang.String CAR_IMAGE_ID = "car-image-id";
    private static final java.lang.String ROUTE_LINE_COLOR = "#0062FF";
    private static final float ROUTE_LINE_WIDTH = 5.0F;
    public static final com.github.owlruslan.rider.services.map.mapbox.MapboxService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mapbox.api.directions.v5.models.DirectionsRoute getCurrentRoute() {
        return null;
    }
    
    public final void setCurrentRoute(@org.jetbrains.annotations.NotNull()
    com.mapbox.api.directions.v5.models.DirectionsRoute p0) {
    }
    
    @java.lang.Override()
    public void init(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap) {
    }
    
    private final com.mapbox.api.directions.v5.MapboxDirections createDirectionsClient(com.mapbox.geojson.Point start, com.mapbox.geojson.Point end) {
        return null;
    }
    
    private final void setRouteSource(com.mapbox.api.directions.v5.models.DirectionsRoute route, java.lang.String routeId, com.mapbox.mapboxsdk.maps.Style style) {
    }
    
    private final com.mapbox.api.directions.v5.models.DirectionsRoute getDirectionsRouteFromResponse(retrofit2.Response<com.mapbox.api.directions.v5.models.DirectionsResponse> response) {
        return null;
    }
    
    private final java.util.ArrayList<com.mapbox.mapboxsdk.geometry.LatLng> createRouteLatLngListFromDirectionsRoute(com.mapbox.api.directions.v5.models.DirectionsRoute route) {
        return null;
    }
    
    private final com.mapbox.mapboxsdk.geometry.LatLngBounds setCameraBoundsWithBottomPadding(java.util.List<? extends com.mapbox.mapboxsdk.geometry.LatLng> routeLatLngList) {
        return null;
    }
    
    private final void setCameraToTopOfScreen(com.mapbox.api.directions.v5.models.DirectionsRoute route) {
    }
    
    private final void showToast(java.lang.String text) {
    }
    
    @java.lang.Override()
    public void showRoute(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.maps.Style style, @org.jetbrains.annotations.NotNull()
    com.mapbox.geojson.Point start, @org.jetbrains.annotations.NotNull()
    com.mapbox.geojson.Point end) {
    }
    
    public final void addSource(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.maps.Style style, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.Nullable()
    com.mapbox.geojson.Point point) {
    }
    
    @java.lang.Override()
    public void addMapboxSources(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.maps.Style style, @org.jetbrains.annotations.NotNull()
    androidx.collection.ArrayMap<java.lang.String, com.mapbox.geojson.Point> points) {
    }
    
    private final void addLayerOfRoute(com.mapbox.mapboxsdk.maps.Style style) {
    }
    
    private final void addImageOfPickupIcon(com.mapbox.mapboxsdk.maps.Style style) {
    }
    
    private final void addLayerOfPickupIcon(com.mapbox.mapboxsdk.maps.Style style) {
    }
    
    private final void addImageOfPulseCircle(com.mapbox.mapboxsdk.maps.Style style) {
    }
    
    private final void addLayerOfPulseCircle(com.mapbox.mapboxsdk.maps.Style style) {
    }
    
    private final void addImageOfDropoffIcon(com.mapbox.mapboxsdk.maps.Style style) {
    }
    
    private final void addLayerOfDropoffIcon(com.mapbox.mapboxsdk.maps.Style style) {
    }
    
    private final void addImageOfCarIcon(com.mapbox.mapboxsdk.maps.Style style) {
    }
    
    public final void addLayerOfCarIcon(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.maps.Style style) {
    }
    
    @java.lang.Override()
    public void addMapboxLayers(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.maps.Style style) {
    }
    
    @java.lang.Override()
    public void cancelCall() {
    }
    
    @javax.inject.Inject()
    public MapboxService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/github/owlruslan/rider/services/map/mapbox/MapboxService$Companion;", "", "()V", "CAR_ICON_LAYER_ID", "", "CAR_ICON_SOURCE_ID", "CAR_IMAGE_ID", "DROPOFF_ICON_LAYER_ID", "DROPOFF_ICON_SOURCE_ID", "DROPOFF_MARKER_IMAGE_ID", "PICKUP_ICON_LAYER_ID", "PICKUP_ICON_SOURCE_ID", "PICKUP_MARKER_IMAGE_ID", "PULSE_CIRCLE_IMAGE_ID", "PULSE_CIRCLE_LAYER_ID", "PULSE_CIRCLE_SOURCE_ID", "ROUTE_LAYER_ID", "ROUTE_LINE_COLOR", "ROUTE_LINE_WIDTH", "", "ROUTE_SOURCE_ID", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}