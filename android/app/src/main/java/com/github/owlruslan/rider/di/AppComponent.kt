package com.github.owlruslan.rider.di

import android.app.Application
import com.github.owlruslan.rider.RiderApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

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
@SuppressWarnings("unchecked")
@Singleton
@Component(modules = [
    ApplicationModule::class,
    ActivityBindingModule::class,
    AndroidSupportInjectionModule::class])
interface AppComponent : AndroidInjector<RiderApplication> {

    // Gives us syntactic sugar. we can then do DaggerAppComponent.builder().application(this).build().inject(this);
    // never having to instantiate any modules or say which module we are passing the application to.
    // Application will just be provided into our app graph now.
    @SuppressWarnings("unchecked")
    @Component.Builder
    interface Builder {

        @SuppressWarnings("unchecked")
        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        @SuppressWarnings("unchecked")
        fun build(): AppComponent
    }
}
