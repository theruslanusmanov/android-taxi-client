package com.github.owlruslan.rider.ui.modes.driver.search;

import com.github.owlruslan.rider.di.FragmentScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = SearchDriverModule_SearchFragment.SearchDriverFragmentSubcomponent.class)
public abstract class SearchDriverModule_SearchFragment {
  private SearchDriverModule_SearchFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SearchDriverFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SearchDriverFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface SearchDriverFragmentSubcomponent extends AndroidInjector<SearchDriverFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SearchDriverFragment> {}
  }
}
