package com.github.owlruslan.rider.di;

import java.lang.System;

/**
 * This is a Dagger component. Refer to [RiderApplication] for the list of Dagger components
 * used in this application.
 *
 *
 * Even though Dagger allows annotating a [Component] as a singleton, the code
 * itself must ensure only one instance of the class is created. This is done in [ ].
 * //[AndroidSupportInjectionModule]
 * // is the module from Dagger.Android that helps with the generation
 * // and location of subcomponents.
 */
@java.lang.SuppressWarnings(value = {"unchecked"})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/github/owlruslan/rider/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/github/owlruslan/rider/RiderApplication;", "Builder", "app_debug"})
@dagger.Component(modules = {com.github.owlruslan.rider.di.ApplicationModule.class, com.github.owlruslan.rider.di.ActivityBindingModule.class, dagger.android.support.AndroidSupportInjectionModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.github.owlruslan.rider.RiderApplication> {
    
    @java.lang.SuppressWarnings(value = {"unchecked"})
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/github/owlruslan/rider/di/AppComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/github/owlruslan/rider/di/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.SuppressWarnings(value = {"unchecked"})
        @dagger.BindsInstance()
        public abstract com.github.owlruslan.rider.di.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.SuppressWarnings(value = {"unchecked"})
        public abstract com.github.owlruslan.rider.di.AppComponent build();
    }
}