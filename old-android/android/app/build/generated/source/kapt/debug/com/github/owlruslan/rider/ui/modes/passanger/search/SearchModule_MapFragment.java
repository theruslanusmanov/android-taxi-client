package com.github.owlruslan.rider.ui.modes.passanger.search;

import com.github.owlruslan.rider.di.FragmentScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = SearchModule_MapFragment.SearchFragmentSubcomponent.class)
public abstract class SearchModule_MapFragment {
  private SearchModule_MapFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SearchFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SearchFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface SearchFragmentSubcomponent extends AndroidInjector<SearchFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SearchFragment> {}
  }
}
