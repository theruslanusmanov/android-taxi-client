package com.github.owlruslan.rider.di;

import com.github.owlruslan.rider.ui.MainActivity;
import com.github.owlruslan.rider.ui.modes.driver.complete.CompleteDriverModule;
import com.github.owlruslan.rider.ui.modes.driver.ride.RideDriverModule;
import com.github.owlruslan.rider.ui.modes.driver.search.SearchDriverModule;
import com.github.owlruslan.rider.ui.modes.passanger.complete.CompleteModule;
import com.github.owlruslan.rider.ui.modes.passanger.ride.RideModule;
import com.github.owlruslan.rider.ui.modes.passanger.search.SearchModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBindingModule_MainActivity.MainActivitySubcomponent.class)
public abstract class ActivityBindingModule_MainActivity {
  private ActivityBindingModule_MainActivity() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent(
    modules = {
      SearchModule.class,
      RideModule.class,
      CompleteModule.class,
      SearchDriverModule.class,
      RideDriverModule.class,
      CompleteDriverModule.class
    }
  )
  @ActivityScoped
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}
