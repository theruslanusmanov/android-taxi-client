// Generated by Dagger (https://dagger.dev).
package com.github.owlruslan.rider.ui.modes.passanger.ride;

import com.github.owlruslan.rider.services.map.mapbox.MapboxService;
import com.github.owlruslan.rider.ui.modes.passanger.complete.CompleteFragment;
import com.github.owlruslan.rider.ui.modes.passanger.search.SearchFragment;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RideFragment_Factory implements Factory<RideFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<RideContract.Presenter> presenterProvider;

  private final Provider<MapboxService> mapboxServiceProvider;

  private final Provider<SearchFragment> p0Provider;

  private final Provider<CompleteFragment> p0Provider2;

  public RideFragment_Factory(Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<RideContract.Presenter> presenterProvider,
      Provider<MapboxService> mapboxServiceProvider, Provider<SearchFragment> p0Provider,
      Provider<CompleteFragment> p0Provider2) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.presenterProvider = presenterProvider;
    this.mapboxServiceProvider = mapboxServiceProvider;
    this.p0Provider = p0Provider;
    this.p0Provider2 = p0Provider2;
  }

  @Override
  public RideFragment get() {
    RideFragment instance = newInstance();
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    RideFragment_MembersInjector.injectPresenter(instance, presenterProvider.get());
    RideFragment_MembersInjector.injectMapboxService(instance, mapboxServiceProvider.get());
    RideFragment_MembersInjector.injectSetSearchFragmentProvider(instance, DoubleCheck.lazy(p0Provider));
    RideFragment_MembersInjector.injectSetCompleteFragmentProvider(instance, DoubleCheck.lazy(p0Provider2));
    return instance;
  }

  public static RideFragment_Factory create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<RideContract.Presenter> presenterProvider,
      Provider<MapboxService> mapboxServiceProvider, Provider<SearchFragment> p0Provider,
      Provider<CompleteFragment> p0Provider2) {
    return new RideFragment_Factory(androidInjectorProvider, presenterProvider, mapboxServiceProvider, p0Provider, p0Provider2);
  }

  public static RideFragment newInstance() {
    return new RideFragment();
  }
}