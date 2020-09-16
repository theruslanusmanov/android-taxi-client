package com.github.owlruslan.rider.ui.modes.passanger.complete;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/github/owlruslan/rider/ui/modes/passanger/complete/CompleteModule;", "", "()V", "completeFragment", "Lcom/github/owlruslan/rider/ui/modes/passanger/complete/CompleteFragment;", "completePresenter", "Lcom/github/owlruslan/rider/ui/modes/passanger/complete/CompleteContract$Presenter;", "presenter", "Lcom/github/owlruslan/rider/ui/modes/passanger/complete/CompletePresenter;", "app_debug"})
@dagger.Module()
public abstract class CompleteModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.github.owlruslan.rider.di.FragmentScoped()
    public abstract com.github.owlruslan.rider.ui.modes.passanger.complete.CompleteFragment completeFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @com.github.owlruslan.rider.di.ActivityScoped()
    public abstract com.github.owlruslan.rider.ui.modes.passanger.complete.CompleteContract.Presenter completePresenter(@org.jetbrains.annotations.NotNull()
    com.github.owlruslan.rider.ui.modes.passanger.complete.CompletePresenter presenter);
    
    public CompleteModule() {
        super();
    }
}