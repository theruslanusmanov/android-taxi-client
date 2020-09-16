package com.github.owlruslan.rider.services.map.mapbox;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH&\u00a8\u0006\u0012"}, d2 = {"Lcom/github/owlruslan/rider/services/map/mapbox/Mapbox;", "", "addMapboxLayers", "", "style", "Lcom/mapbox/mapboxsdk/maps/Style;", "addMapboxSources", "points", "Landroidx/collection/ArrayMap;", "", "Lcom/mapbox/geojson/Point;", "cancelCall", "init", "mapboxMap", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "showRoute", "start", "end", "app_debug"})
public abstract interface Mapbox {
    
    public abstract void init(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap);
    
    public abstract void showRoute(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.maps.Style style, @org.jetbrains.annotations.NotNull()
    com.mapbox.geojson.Point start, @org.jetbrains.annotations.NotNull()
    com.mapbox.geojson.Point end);
    
    public abstract void addMapboxLayers(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.maps.Style style);
    
    public abstract void addMapboxSources(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.maps.Style style, @org.jetbrains.annotations.NotNull()
    androidx.collection.ArrayMap<java.lang.String, com.mapbox.geojson.Point> points);
    
    public abstract void cancelCall();
}