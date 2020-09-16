package com.github.owlruslan.rider.ui.modes.driver.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/driver/search/SearchDriverContract;", "", "Presenter", "View", "app_debug"})
public abstract interface SearchDriverContract {
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/driver/search/SearchDriverContract$View;", "Lcom/github/owlruslan/rider/ui/base/BaseView;", "Lcom/github/owlruslan/rider/ui/modes/passanger/search/SearchContract$Presenter;", "app_debug"})
    public static abstract interface View extends com.github.owlruslan.rider.ui.base.BaseView<com.github.owlruslan.rider.ui.modes.passanger.search.SearchContract.Presenter> {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/driver/search/SearchDriverContract$Presenter;", "Lcom/github/owlruslan/rider/ui/base/BasePresenter;", "Lcom/github/owlruslan/rider/ui/modes/driver/search/SearchDriverContract$View;", "app_debug"})
    public static abstract interface Presenter extends com.github.owlruslan.rider.ui.base.BasePresenter<com.github.owlruslan.rider.ui.modes.driver.search.SearchDriverContract.View> {
    }
}