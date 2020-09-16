package com.github.owlruslan.rider.ui.modes.driver.complete;

import com.github.owlruslan.rider.di.FragmentScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = CompleteDriverModule_CompleteFragment.CompleteDriverFragmentSubcomponent.class
)
public abstract class CompleteDriverModule_CompleteFragment {
  private CompleteDriverModule_CompleteFragment() {}

  @Binds
  @IntoMap
  @ClassKey(CompleteDriverFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CompleteDriverFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface CompleteDriverFragmentSubcomponent
      extends AndroidInjector<CompleteDriverFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CompleteDriverFragment> {}
  }
}
