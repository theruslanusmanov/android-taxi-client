package com.github.owlruslan.rider.ui.modes.passanger.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/search/OnSearchListClickListener;", "", "onItemClick", "", "model", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "type", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchListTypes;", "app_debug"})
public abstract interface OnSearchListClickListener {
    
    public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
    com.google.android.libraries.places.api.model.AutocompletePrediction model, @org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.ui.modes.passanger.search.SearchListTypes type);
}