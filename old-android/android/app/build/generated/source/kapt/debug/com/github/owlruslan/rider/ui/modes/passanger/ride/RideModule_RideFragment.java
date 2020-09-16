package com.github.owlruslan.rider.ui.modes.passanger.ride;

import com.github.owlruslan.rider.di.FragmentScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = RideModule_RideFragment.RideFragmentSubcomponent.class)
public abstract class RideModule_RideFragment {
  private RideModule_RideFragment() {}

  @Binds
  @IntoMap
  @ClassKey(RideFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RideFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface RideFragmentSubcomponent extends AndroidInjector<RideFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RideFragment> {}
  }
}
