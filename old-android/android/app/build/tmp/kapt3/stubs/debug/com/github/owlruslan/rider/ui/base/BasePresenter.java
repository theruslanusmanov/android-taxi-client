package com.github.owlruslan.rider.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/github/owlruslan/rider/ui/base/BasePresenter;", "T", "", "dropView", "", "takeView", "view", "(Ljava/lang/Object;)V", "app_debug"})
public abstract interface BasePresenter<T extends java.lang.Object> {
    
    /**
     * Binds presenter with a view when resumed. The Presenter will perform initialization here.
     *
     * @param view the view associated with this presenter
     */
    public abstract void takeView(T view);
    
    /**
     * Drops the reference to the view when destroyed
     */
    public abstract void dropView();
}