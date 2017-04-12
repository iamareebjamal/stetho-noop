package com.facebook.stetho;

import android.content.Context;
import android.support.annotation.Nullable;

import com.facebook.stetho.dumpapp.DumperPlugin;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;
import com.facebook.stetho.inspector.database.DatabaseFilesProvider;
import com.facebook.stetho.inspector.elements.DocumentProviderFactory;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.module.Database;

import java.util.ArrayList;



@SuppressWarnings("ALL")
public class Stetho
{
    private Stetho()
    {
    }

    /**
     * Construct a simple initializer helper which allows you to customize stetho behaviour
     * with additional features, plugins, etc.  See {@link DefaultDumperPluginsBuilder} and
     * {@link DefaultInspectorModulesBuilder} for more information.
     * <p/>
     * For simple use cases, consider {@link #initializeWithDefaults(Context)}.
     */
    public static InitializerBuilder newInitializerBuilder(Context context)
    {
        return new InitializerBuilder(context);
    }

    /**
     * Start the listening server.  Most of the heavy lifting initialization is deferred until the
     * first socket connection is received, allowing this to be safely used for debug builds on
     * even low-end hardware without noticeably affecting performance.
     */
    public static void initializeWithDefaults(final Context context)
    {

    }

    /**
     * Start the listening service, providing a custom initializer as per
     * {@link #newInitializerBuilder}.
     *
     * @see #initializeWithDefaults(Context)
     */
    public static void initialize(final Initializer initializer)
    {

    }

    public static DumperPluginsProvider defaultDumperPluginsProvider(final Context context)
    {
        return null;
    }

    public static InspectorModulesProvider defaultInspectorModulesProvider(final Context context)
    {
        return null;
    }


    public static final class DefaultDumperPluginsBuilder
    {
        private final PluginBuilder<DumperPlugin> mDelegate = new PluginBuilder<>();

        public DefaultDumperPluginsBuilder(Context context)
        {

        }

        public DefaultDumperPluginsBuilder provide(DumperPlugin plugin)
        {
            return this;
        }

        private DefaultDumperPluginsBuilder provideIfDesired(DumperPlugin plugin)
        {
            return this;
        }

        public DefaultDumperPluginsBuilder remove(String pluginName)
        {
            return this;
        }

        public Iterable<DumperPlugin> finish()
        {
            return mDelegate.finish();
        }
    }


    private static class PluginBuilder<T>
    {
        public void provide(String name, T plugin)
        {
        }

        public void provideIfDesired(String name, T plugin)
        {
        }

        public void remove(String pluginName)
        {
        }

        public Iterable<T> finish()
        {
            return mPlugins;
        }

        private final ArrayList<T> mPlugins = new ArrayList<>();
    }


    public static final class DefaultInspectorModulesBuilder
    {
        private final PluginBuilder<ChromeDevtoolsDomain> mDelegate = new PluginBuilder<>();

        public DefaultInspectorModulesBuilder(Context context)
        {
        }

        public DefaultInspectorModulesBuilder documentProvider(DocumentProviderFactory factory)
        {
            return this;
        }

        public DefaultInspectorModulesBuilder runtimeRepl(RuntimeReplFactory factory)
        {
            return this;
        }


        public DefaultInspectorModulesBuilder databaseFiles(DatabaseFilesProvider provider)
        {
            return this;
        }

        public DefaultInspectorModulesBuilder provideDatabaseDriver(Database.DatabaseDriver databaseDriver)
        {

            return this;
        }


        public DefaultInspectorModulesBuilder provide(ChromeDevtoolsDomain module)
        {
            return this;
        }

        private DefaultInspectorModulesBuilder provideIfDesired(ChromeDevtoolsDomain module)
        {
            return this;
        }


        public DefaultInspectorModulesBuilder remove(String moduleName)
        {
            return this;
        }

        public Iterable<ChromeDevtoolsDomain> finish()
        {

            return mDelegate.finish();
        }

        @Nullable
        private DocumentProviderFactory resolveDocumentProvider()
        {

            return null;
        }
    }


    public static abstract class Initializer
    {

        protected Initializer()
        {
        }
    }


    public static class InitializerBuilder
    {

        private InitializerBuilder(Context context)
        {

        }

        public InitializerBuilder enableDumpapp(DumperPluginsProvider plugins)
        {
            return this;
        }

        public InitializerBuilder enableWebKitInspector(InspectorModulesProvider modules)
        {
            return this;
        }

        public Initializer build()
        {
            return new BuilderBasedInitializer(this);
        }
    }


    private static class BuilderBasedInitializer extends Initializer
    {

        private BuilderBasedInitializer(InitializerBuilder b)
        {
            super();
        }
    }
}
