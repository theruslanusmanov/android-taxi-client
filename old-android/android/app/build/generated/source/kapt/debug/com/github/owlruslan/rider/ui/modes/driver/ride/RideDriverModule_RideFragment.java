package com.github.owlruslan.rider.ui.modes.driver.ride;

import com.github.owlruslan.rider.di.FragmentScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = RideDriverModule_RideFragment.RideDriverFragmentSubcomponent.class)
public abstract class RideDriverModule_RideFragment {
  private RideDriverModule_RideFragment() {}

  @Binds
  @IntoMap
  @ClassKey(RideDriverFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RideDriverFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface RideDriverFragmentSubcomponent extends AndroidInjector<RideDriverFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RideDriverFragment> {}
  }
}
