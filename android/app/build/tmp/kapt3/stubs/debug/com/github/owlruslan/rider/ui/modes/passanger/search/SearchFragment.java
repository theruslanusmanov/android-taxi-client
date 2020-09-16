package com.github.owlruslan.rider.ui.modes.passanger.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 q2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001qB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0006J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u000208H\u0016J\u0010\u0010:\u001a\u0002082\u0006\u0010;\u001a\u00020<H\u0003J\b\u0010=\u001a\u000208H\u0016J\b\u0010>\u001a\u000208H\u0016J\u0012\u0010?\u001a\u0002082\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J&\u0010B\u001a\u0004\u0018\u0001012\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010F2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\b\u0010G\u001a\u000208H\u0016J\b\u0010H\u001a\u000208H\u0016J\u0018\u0010I\u001a\u0002082\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010KH\u0016J\u0018\u0010M\u001a\u0002082\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QH\u0016J\b\u0010R\u001a\u000208H\u0016J\u0010\u0010S\u001a\u0002082\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010T\u001a\u000208H\u0016J\u0010\u0010U\u001a\u0002082\u0006\u0010V\u001a\u00020WH\u0016J-\u0010X\u001a\u0002082\u0006\u0010Y\u001a\u00020Z2\u000e\u0010[\u001a\n\u0012\u0006\b\u0001\u0012\u00020L0\\2\u0006\u0010]\u001a\u00020^H\u0016\u00a2\u0006\u0002\u0010_J\b\u0010`\u001a\u000208H\u0016J\u0010\u0010a\u001a\u0002082\u0006\u0010b\u001a\u00020AH\u0016J\b\u0010c\u001a\u000208H\u0016J\b\u0010d\u001a\u000208H\u0016J\u001a\u0010e\u001a\u0002082\u0006\u0010f\u001a\u0002012\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u001e\u0010g\u001a\u0002082\u0006\u0010f\u001a\u0002012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u001e\u0010h\u001a\u0002082\u0006\u0010f\u001a\u0002012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010i\u001a\u000208H\u0016J\b\u0010j\u001a\u000208H\u0016J\b\u0010k\u001a\u000208H\u0016J\b\u0010l\u001a\u000208H\u0016J(\u0010m\u001a\u0002082\u0016\u0010n\u001a\u0012\u0012\u0004\u0012\u00020O0oj\b\u0012\u0004\u0012\u00020O`p2\u0006\u0010P\u001a\u00020QH\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R4\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u000201X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u000e\u00106\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006r"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchFragment;", "Ldagger/android/support/DaggerFragment;", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchContract$View;", "Lcom/mapbox/mapboxsdk/maps/OnMapReadyCallback;", "Lcom/mapbox/android/core/permissions/PermissionsListener;", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/OnSearchListClickListener;", "()V", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/LinearLayout;", "getBottomSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "setBottomSheetBehavior", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "endPointTextWatcher", "Landroid/text/TextWatcher;", "lastSlideOffset", "", "getLastSlideOffset", "()F", "setLastSlideOffset", "(F)V", "mapView", "Lcom/mapbox/mapboxsdk/maps/MapView;", "mapboxMap", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "permissionsManager", "Lcom/mapbox/android/core/permissions/PermissionsManager;", "placesService", "Lcom/github/owlruslan/rider/services/places/PlacesService;", "getPlacesService", "()Lcom/github/owlruslan/rider/services/places/PlacesService;", "setPlacesService", "(Lcom/github/owlruslan/rider/services/places/PlacesService;)V", "presenter", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchContract$Presenter;", "getPresenter", "()Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchContract$Presenter;", "setPresenter", "(Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchContract$Presenter;)V", "<set-?>", "Ldagger/Lazy;", "Lcom/github/owlruslan/rider/ui/modes/passanger/ride/RideFragment;", "rideFragmentProvider", "getRideFragmentProvider", "()Ldagger/Lazy;", "setRideFragmentProvider", "(Ldagger/Lazy;)V", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "startPointTextWatcher", "clearFields", "", "createPlacesInstance", "enableLocationComponent", "loadedMapStyle", "Lcom/mapbox/mapboxsdk/maps/Style;", "hideQuickPlacesLayout", "initBottomSheet", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onExplanationNeeded", "permissionsToExplain", "", "", "onItemClick", "model", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "type", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchListTypes;", "onLowMemory", "onMapReady", "onPause", "onPermissionResult", "granted", "", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "onViewCreated", "view", "showCollapsedSearch", "showExpandedSearch", "showMap", "showMenuIcon", "showQuickPlacesLayout", "showRideView", "showSearchList", "dataset", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Companion", "app_debug"})
@com.github.owlruslan.rider.di.ActivityScoped()
public final class SearchFragment extends dagger.android.support.DaggerFragment implements com.github.owlruslan.rider.ui.modes.passanger.search.SearchContract.View, com.mapbox.mapboxsdk.maps.OnMapReadyCallback, com.mapbox.android.core.permissions.PermissionsListener, com.github.owlruslan.rider.ui.modes.passanger.search.OnSearchListClickListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.github.owlruslan.rider.ui.modes.passanger.search.SearchContract.Presenter presenter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.github.owlruslan.rider.services.places.PlacesService placesService;
    @org.jetbrains.annotations.Nullable()
    private dagger.Lazy<com.github.owlruslan.rider.ui.modes.passanger.ride.RideFragment> rideFragmentProvider;
    @org.jetbrains.annotations.NotNull()
    public android.view.View rootView;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.LinearLayout> bottomSheetBehavior;
    private android.text.TextWatcher startPointTextWatcher;
    private android.text.TextWatcher endPointTextWatcher;
    private float lastSlideOffset = 0.0F;
    private com.mapbox.android.core.permissions.PermissionsManager permissionsManager;
    private com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap;
    private com.mapbox.mapboxsdk.maps.MapView mapView;
    @org.jetbrains.annotations.NotNull()
    private static final com.google.android.libraries.places.api.model.AutocompleteSessionToken AUTOCOMPLETE_SESSION_TOKEN = null;
    private static final int CARD_VIEW_HEIGHT = 520;
    private static final int SEARCH_CARD_VIEW_HEIGHT = 96;
    public static final com.github.owlruslan.rider.ui.modes.passanger.search.SearchFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.owlruslan.rider.ui.modes.passanger.search.SearchContract.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.ui.modes.passanger.search.SearchContract.Presenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.owlruslan.rider.services.places.PlacesService getPlacesService() {
        return null;
    }
    
    public final void setPlacesService(@org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.services.places.PlacesService p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final dagger.Lazy<com.github.owlruslan.rider.ui.modes.passanger.ride.RideFragment> getRideFragmentProvider() {
        return null;
    }
    
    @javax.inject.Inject()
    public final void setRideFragmentProvider(@org.jetbrains.annotations.Nullable()
    dagger.Lazy<com.github.owlruslan.rider.ui.modes.passanger.ride.RideFragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getRootView() {
        return null;
    }
    
    public final void setRootView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.LinearLayout> getBottomSheetBehavior() {
        return null;
    }
    
    public final void setBottomSheetBehavior(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.LinearLayout> p0) {
    }
    
    public final float getLastSlideOffset() {
        return 0.0F;
    }
    
    public final void setLastSlideOffset(float p0) {
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
    public void showRideView() {
    }
    
    @java.lang.Override()
    public void showMenuIcon() {
    }
    
    @java.lang.Override()
    public void showMap() {
    }
    
    @java.lang.Override()
    public void initBottomSheet() {
    }
    
    @java.lang.Override()
    public void showExpandedSearch(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.LinearLayout> bottomSheetBehavior) {
    }
    
    @java.lang.Override()
    public void showCollapsedSearch(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.LinearLayout> bottomSheetBehavior) {
    }
    
    @java.lang.Override()
    public void createPlacesInstance() {
    }
    
    @java.lang.Override()
    public void showSearchList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.google.android.libraries.places.api.model.AutocompletePrediction> dataset, @org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.ui.modes.passanger.search.SearchListTypes type) {
    }
    
    @java.lang.Override()
    public void hideQuickPlacesLayout() {
    }
    
    @java.lang.Override()
    public void showQuickPlacesLayout() {
    }
    
    @java.lang.Override()
    public void clearFields() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.google.android.libraries.places.api.model.AutocompletePrediction model, @org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.ui.modes.passanger.search.SearchListTypes type) {
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
    public SearchFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchFragment$Companion;", "", "()V", "AUTOCOMPLETE_SESSION_TOKEN", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "getAUTOCOMPLETE_SESSION_TOKEN", "()Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "CARD_VIEW_HEIGHT", "", "SEARCH_CARD_VIEW_HEIGHT", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.libraries.places.api.model.AutocompleteSessionToken getAUTOCOMPLETE_SESSION_TOKEN() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}