package com.jake.huntkey.core.app;

import android.content.Context;
import android.os.Handler;


public final class HkEngine {

    public static Configurator init(Context context) {
        Configurator.getInstance()
                .getHkConfigs()
                .put(ConfigKeys.APPLICATION_CONTEXT, context.getApplicationContext());
        return Configurator.getInstance();
    }

    public static Configurator getConfigurator() {
        return Configurator.getInstance();
    }

    public static <T> T getConfiguration(Object key) {
        return getConfigurator().getConfiguration(key);
    }

    public static Context getApplicationContext() {
        return getConfiguration(ConfigKeys.APPLICATION_CONTEXT);
    }

    public static Handler getHandler() {
        return getConfiguration(ConfigKeys.HANDLER);
    }


}