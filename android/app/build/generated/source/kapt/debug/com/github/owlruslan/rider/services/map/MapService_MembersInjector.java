// Generated by Dagger (https://dagger.dev).
package com.github.owlruslan.rider.services.map;

import android.app.Activity;
import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MapService_MembersInjector implements MembersInjector<MapService> {
  private final Provider<Activity> activityProvider;

  private final Provider<Context> contextProvider;

  public MapService_MembersInjector(Provider<Activity> activityProvider,
      Provider<Context> contextProvider) {
    this.activityProvider = activityProvider;
    this.contextProvider = contextProvider;
  }

  public static MembersInjector<MapService> create(Provider<Activity> activityProvider,
      Provider<Context> contextProvider) {
    return new MapService_MembersInjector(activityProvider, contextProvider);
  }

  @Override
  public void injectMembers(MapService instance) {
    injectActivity(instance, activityProvider.get());
    injectContext(instance, contextProvider.get());
  }

  @InjectedFieldSignature("com.github.owlruslan.rider.services.map.MapService.activity")
  public static void injectActivity(MapService instance, Activity activity) {
    instance.activity = activity;
  }

  @InjectedFieldSignature("com.github.owlruslan.rider.services.map.MapService.context")
  public static void injectContext(MapService instance, Context context) {
    instance.context = context;
  }
}