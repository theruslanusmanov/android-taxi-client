package com.github.owlruslan.rider;

import java.lang.System;

/**
 * We create a custom [Application] class that extends  [DaggerApplication].
 * We then override applicationInjector() which tells Dagger how to make our @Singleton Component
 * We never have to call `component.inject(this)` as [DaggerApplication] will do that for us.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0004H\u0014\u00a8\u0006\u0005"}, d2 = {"Lcom/github/owlruslan/rider/RiderApplication;", "Ldagger/android/DaggerApplication;", "()V", "applicationInjector", "Ldagger/android/AndroidInjector;", "app_debug"})
public final class RiderApplication extends dagger.android.DaggerApplication {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected dagger.android.AndroidInjector<? extends dagger.android.DaggerApplication> applicationInjector() {
        return null;
    }
    
    public RiderApplication() {
        super();
    }
}