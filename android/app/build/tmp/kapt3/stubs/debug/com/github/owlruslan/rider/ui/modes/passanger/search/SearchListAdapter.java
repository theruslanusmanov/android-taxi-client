package com.github.owlruslan.rider.ui.modes.passanger.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB+\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchListAdapter$SearchListViewHolder;", "searchList", "Ljava/util/ArrayList;", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "listener", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/OnSearchListClickListener;", "type", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchListTypes;", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;Lcom/github/owlruslan/rider/ui/modes/passanger/search/OnSearchListClickListener;Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchListTypes;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getListener", "()Lcom/github/owlruslan/rider/ui/modes/passanger/search/OnSearchListClickListener;", "getType", "()Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchListTypes;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SearchListViewHolder", "app_debug"})
public final class SearchListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.github.owlruslan.rider.ui.modes.passanger.search.SearchListAdapter.SearchListViewHolder> {
    private final java.util.ArrayList<com.google.android.libraries.places.api.model.AutocompletePrediction> searchList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.github.owlruslan.rider.ui.modes.passanger.search.OnSearchListClickListener listener = null;
    @org.jetbrains.annotations.NotNull()
    private final com.github.owlruslan.rider.ui.modes.passanger.search.SearchListTypes type = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.github.owlruslan.rider.ui.modes.passanger.search.SearchListAdapter.SearchListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.ui.modes.passanger.search.SearchListAdapter.SearchListViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.owlruslan.rider.ui.modes.passanger.search.OnSearchListClickListener getListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.owlruslan.rider.ui.modes.passanger.search.SearchListTypes getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public SearchListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.google.android.libraries.places.api.model.AutocompletePrediction> searchList, @org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.ui.modes.passanger.search.OnSearchListClickListener listener, @org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.ui.modes.passanger.search.SearchListTypes type, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchListAdapter$SearchListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "fullTextView", "Landroid/widget/TextView;", "textView", "bind", "", "prediction", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "app_debug"})
    public static final class SearchListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView textView = null;
        private final android.widget.TextView fullTextView = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.google.android.libraries.places.api.model.AutocompletePrediction prediction) {
        }
        
        public SearchListViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}