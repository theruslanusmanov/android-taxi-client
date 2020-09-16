package com.github.owlruslan.rider.ui.modes.passanger.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J(\u0010\t\u001a\u00020\u00062\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\u001e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J(\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchPresenter;", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchContract$Presenter;", "()V", "view", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchContract$View;", "addBottomSheet", "", "addMap", "addMenuIcon", "addSearchList", "dataset", "Ljava/util/ArrayList;", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "Lkotlin/collections/ArrayList;", "type", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchListTypes;", "collapseSearch", "Landroid/view/View;", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/LinearLayout;", "dropView", "expandSearch", "hideQuickPlaces", "initPlaces", "openRideView", "showQuickPlaces", "startSearch", "searchText", "", "placesClient", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "token", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "takeView", "Companion", "app_debug"})
@com.github.owlruslan.rider.di.ActivityScoped()
public final class SearchPresenter implements com.github.owlruslan.rider.ui.modes.passanger.search.SearchContract.Presenter {
    private com.github.owlruslan.rider.ui.modes.passanger.search.SearchContract.View view;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "SearchDriverPresenter";
    public static final com.github.owlruslan.rider.ui.modes.passanger.search.SearchPresenter.Companion Companion = null;
    
    @java.lang.Override()
    public void takeView(@org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.ui.modes.passanger.search.SearchContract.View view) {
    }
    
    @java.lang.Override()
    public void dropView() {
    }
    
    @java.lang.Override()
    public void openRideView() {
    }
    
    @java.lang.Override()
    public void addMenuIcon() {
    }
    
    @java.lang.Override()
    public void addMap() {
    }
    
    @java.lang.Override()
    public void addBottomSheet() {
    }
    
    @java.lang.Override()
    public void expandSearch(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.LinearLayout> bottomSheetBehavior) {
    }
    
    @java.lang.Override()
    public void collapseSearch(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.LinearLayout> bottomSheetBehavior) {
    }
    
    @java.lang.Override()
    public void initPlaces() {
    }
    
    @java.lang.Override()
    public void addSearchList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.google.android.libraries.places.api.model.AutocompletePrediction> dataset, @org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.ui.modes.passanger.search.SearchListTypes type) {
    }
    
    @java.lang.Override()
    public void hideQuickPlaces() {
    }
    
    @java.lang.Override()
    public void showQuickPlaces() {
    }
    
    @java.lang.Override()
    public void startSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String searchText, @org.jetbrains.annotations.NotNull()
    com.google.android.libraries.places.api.net.PlacesClient placesClient, @org.jetbrains.annotations.NotNull()
    com.google.android.libraries.places.api.model.AutocompleteSessionToken token, @org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.ui.modes.passanger.search.SearchListTypes type) {
    }
    
    @javax.inject.Inject()
    public SearchPresenter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchPresenter$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}