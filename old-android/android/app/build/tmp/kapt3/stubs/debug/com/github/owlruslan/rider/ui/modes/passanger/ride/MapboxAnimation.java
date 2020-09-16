package com.github.owlruslan.rider.ui.modes.passanger.ride;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020,H\u0002J\u0016\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201J.\u00102\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\t2\u0006\u00103\u001a\u0002042\u0006\u0010+\u001a\u00020,J\u0018\u00105\u001a\u0002062\u0006\u0010&\u001a\u00020\u001a2\u0006\u00107\u001a\u00020)H\u0002J\u000e\u00108\u001a\u00020%2\u0006\u0010+\u001a\u00020,R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u00069"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/ride/MapboxAnimation;", "", "()V", "CAR_ANIMATION_DURATION", "", "MAX_PROPERTY_VALUE", "", "MIN_PROPERTY_VALUE", "PULSE_CIRCLE_MULTIPLIER", "", "SEARCH_ANIMATION_DURATION", "cameraIdleListener", "Lcom/mapbox/mapboxsdk/maps/MapboxMap$OnCameraIdleListener;", "getCameraIdleListener", "()Lcom/mapbox/mapboxsdk/maps/MapboxMap$OnCameraIdleListener;", "setCameraIdleListener", "(Lcom/mapbox/mapboxsdk/maps/MapboxMap$OnCameraIdleListener;)V", "carAnimationEndBehaviorSubject", "Lio/reactivex/subjects/BehaviorSubject;", "getCarAnimationEndBehaviorSubject", "()Lio/reactivex/subjects/BehaviorSubject;", "setCarAnimationEndBehaviorSubject", "(Lio/reactivex/subjects/BehaviorSubject;)V", "carIconAnimator", "Landroid/animation/ValueAnimator;", "carIconCurrentLocation", "Lcom/mapbox/mapboxsdk/geometry/LatLng;", "latLngEvaluator", "Landroid/animation/TypeEvaluator;", "getLatLngEvaluator", "()Landroid/animation/TypeEvaluator;", "searchMarkerAnimator", "getSearchMarkerAnimator", "()Landroid/animation/ValueAnimator;", "setSearchMarkerAnimator", "(Landroid/animation/ValueAnimator;)V", "animateCameraToPoint", "", "point", "Lcom/mapbox/geojson/Point;", "zoom", "", "animationTime", "map", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "animateCarMoving", "style", "Lcom/mapbox/mapboxsdk/maps/Style;", "mapboxService", "Lcom/github/owlruslan/rider/services/map/mapbox/MapboxService;", "animateSearch", "pulseCircleLayerId", "", "createCameraPosition", "Lcom/mapbox/mapboxsdk/camera/CameraPosition;", "zoomValue", "stopAnimateSearch", "app_debug"})
public final class MapboxAnimation {
    @org.jetbrains.annotations.NotNull()
    public static io.reactivex.subjects.BehaviorSubject<java.lang.Object> carAnimationEndBehaviorSubject;
    private static final long SEARCH_ANIMATION_DURATION = 1000L;
    private static final long CAR_ANIMATION_DURATION = 300L;
    private static final int PULSE_CIRCLE_MULTIPLIER = 10;
    private static final float MIN_PROPERTY_VALUE = 0.0F;
    private static final float MAX_PROPERTY_VALUE = 1.0F;
    @org.jetbrains.annotations.NotNull()
    public static android.animation.ValueAnimator searchMarkerAnimator;
    @org.jetbrains.annotations.NotNull()
    public static com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraIdleListener cameraIdleListener;
    private static android.animation.ValueAnimator carIconAnimator;
    private static com.mapbox.mapboxsdk.geometry.LatLng carIconCurrentLocation;
    @org.jetbrains.annotations.NotNull()
    private static final android.animation.TypeEvaluator<com.mapbox.mapboxsdk.geometry.LatLng> latLngEvaluator = null;
    public static final com.github.owlruslan.rider.ui.modes.passanger.ride.MapboxAnimation INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<java.lang.Object> getCarAnimationEndBehaviorSubject() {
        return null;
    }
    
    public final void setCarAnimationEndBehaviorSubject(@org.jetbrains.annotations.NotNull()
    io.reactivex.subjects.BehaviorSubject<java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.animation.ValueAnimator getSearchMarkerAnimator() {
        return null;
    }
    
    public final void setSearchMarkerAnimator(@org.jetbrains.annotations.NotNull()
    android.animation.ValueAnimator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraIdleListener getCameraIdleListener() {
        return null;
    }
    
    public final void setCameraIdleListener(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraIdleListener p0) {
    }
    
    private final com.mapbox.mapboxsdk.camera.CameraPosition createCameraPosition(com.mapbox.mapboxsdk.geometry.LatLng point, double zoomValue) {
        return null;
    }
    
    private final void animateCameraToPoint(com.mapbox.geojson.Point point, double zoom, int animationTime, com.mapbox.mapboxsdk.maps.MapboxMap map) {
    }
    
    public final void animateSearch(@org.jetbrains.annotations.NotNull()
    com.mapbox.geojson.Point point, double zoom, int animationTime, @org.jetbrains.annotations.NotNull()
    java.lang.String pulseCircleLayerId, @org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.maps.MapboxMap map) {
    }
    
    public final void stopAnimateSearch(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.maps.MapboxMap map) {
    }
    
    public final void animateCarMoving(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.maps.Style style, @org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.services.map.mapbox.MapboxService mapboxService) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.animation.TypeEvaluator<com.mapbox.mapboxsdk.geometry.LatLng> getLatLngEvaluator() {
        return null;
    }
    
    private MapboxAnimation() {
        super();
    }
}