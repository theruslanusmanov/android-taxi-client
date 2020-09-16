package com.github.owlruslan.rider.ui.modes.passanger.complete;

import com.github.owlruslan.rider.di.FragmentScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = CompleteModule_CompleteFragment.CompleteFragmentSubcomponent.class)
public abstract class CompleteModule_CompleteFragment {
  private CompleteModule_CompleteFragment() {}

  @Binds
  @IntoMap
  @ClassKey(CompleteFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CompleteFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface CompleteFragmentSubcomponent extends AndroidInjector<CompleteFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CompleteFragment> {}
  }
}
