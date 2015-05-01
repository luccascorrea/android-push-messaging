// Code generated by dagger-compiler.  Do not edit.
package br.com.estudio89.push_messaging.injection;

import dagger.internal.BindingsGroup;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class AppContextModule$$ModuleAdapter extends ModuleAdapter<AppContextModule> {
  private static final String[] INJECTS = { "members/android.content.Context", };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { br.com.estudio89.push_messaging.injection.PushConfigModule.class, };

  public AppContextModule$$ModuleAdapter() {
    super(br.com.estudio89.push_messaging.injection.AppContextModule.class, INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, true /*complete*/, false /*library*/);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(BindingsGroup bindings, AppContextModule module) {
    bindings.contributeProvidesBinding("android.content.Context", new ProvideAppContextProvidesAdapter(module));
  }

  /**
   * A {@code Binding<android.content.Context>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<android.content.Context>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideAppContextProvidesAdapter extends ProvidesBinding<android.content.Context>
      implements Provider<android.content.Context> {
    private final AppContextModule module;

    public ProvideAppContextProvidesAdapter(AppContextModule module) {
      super("android.content.Context", IS_SINGLETON, "br.com.estudio89.push_messaging.injection.AppContextModule", "provideAppContext");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.content.Context>}.
     */
    @Override
    public android.content.Context get() {
      return module.provideAppContext();
    }
  }
}
