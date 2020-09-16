package com.github.owlruslan.rider.ui.modes.passanger.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchContract;", "", "Presenter", "View", "app_debug"})
public abstract interface SearchContract {
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\u001e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u001e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\b\u0010\u000f\u001a\u00020\u0004H&J\b\u0010\u0010\u001a\u00020\u0004H&J\b\u0010\u0011\u001a\u00020\u0004H&J\b\u0010\u0012\u001a\u00020\u0004H&J(\u0010\u0013\u001a\u00020\u00042\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&\u00a8\u0006\u001a"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchContract$View;", "Lcom/github/owlruslan/rider/ui/base/BaseView;", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchContract$Presenter;", "clearFields", "", "createPlacesInstance", "hideQuickPlacesLayout", "initBottomSheet", "showCollapsedSearch", "view", "Landroid/view/View;", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/LinearLayout;", "showExpandedSearch", "showMap", "showMenuIcon", "showQuickPlacesLayout", "showRideView", "showSearchList", "dataset", "Ljava/util/ArrayList;", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "Lkotlin/collections/ArrayList;", "type", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchListTypes;", "app_debug"})
    public static abstract interface View extends com.github.owlruslan.rider.ui.base.BaseView<com.github.owlruslan.rider.ui.modes.passanger.search.SearchContract.Presenter> {
        
        public abstract void showRideView();
        
        public abstract void showMenuIcon();
        
        public abstract void showMap();
        
        public abstract void initBottomSheet();
        
        public abstract void showExpandedSearch(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.LinearLayout> bottomSheetBehavior);
        
        public abstract void showCollapsedSearch(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.LinearLayout> bottomSheetBehavior);
        
        public abstract void createPlacesInstance();
        
        public abstract void showSearchList(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.google.android.libraries.places.api.model.AutocompletePrediction> dataset, @org.jetbrains.annotations.NotNull()
        com.github.owlruslan.rider.ui.modes.passanger.search.SearchListTypes type);
        
        public abstract void hideQuickPlacesLayout();
        
        public abstract void showQuickPlacesLayout();
        
        public abstract void clearFields();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J(\u0010\u0007\u001a\u00020\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u001e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&J\u001e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&J\b\u0010\u0015\u001a\u00020\u0004H&J\b\u0010\u0016\u001a\u00020\u0004H&J\b\u0010\u0017\u001a\u00020\u0004H&J\b\u0010\u0018\u001a\u00020\u0004H&J(\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006 "}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchContract$Presenter;", "Lcom/github/owlruslan/rider/ui/base/BasePresenter;", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchContract$View;", "addBottomSheet", "", "addMap", "addMenuIcon", "addSearchList", "dataset", "Ljava/util/ArrayList;", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "Lkotlin/collections/ArrayList;", "type", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchListTypes;", "collapseSearch", "view", "Landroid/view/View;", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/LinearLayout;", "expandSearch", "hideQuickPlaces", "initPlaces", "openRideView", "showQuickPlaces", "startSearch", "searchText", "", "placesClient", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "token", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "app_debug"})
    public static abstract interface Presenter extends com.github.owlruslan.rider.ui.base.BasePresenter<com.github.owlruslan.rider.ui.modes.passanger.search.SearchContract.View> {
        
        public abstract void openRideView();
        
        public abstract void addMenuIcon();
        
        public abstract void addMap();
        
        public abstract void addBottomSheet();
        
        public abstract void expandSearch(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.LinearLayout> bottomSheetBehavior);
        
        public abstract void collapseSearch(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.LinearLayout> bottomSheetBehavior);
        
        public abstract void initPlaces();
        
        public abstract void addSearchList(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.google.android.libraries.places.api.model.AutocompletePrediction> dataset, @org.jetbrains.annotations.NotNull()
        com.github.owlruslan.rider.ui.modes.passanger.search.SearchListTypes type);
        
        public abstract void hideQuickPlaces();
        
        public abstract void showQuickPlaces();
        
        public abstract void startSearch(@org.jetbrains.annotations.NotNull()
        java.lang.String searchText, @org.jetbrains.annotations.NotNull()
        com.google.android.libraries.places.api.net.PlacesClient placesClient, @org.jetbrains.annotations.NotNull()
        com.google.android.libraries.places.api.model.AutocompleteSessionToken token, @org.jetbrains.annotations.NotNull()
        com.github.owlruslan.rider.ui.modes.passanger.search.SearchListTypes type);
    }
}