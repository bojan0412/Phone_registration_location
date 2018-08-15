package com.example.bojan.phoneregistrationlocation.utils;

import android.content.Context;

/**
 * Create by bojan
 * on 2018/8/15
 */
public class AppContextUtil {
    private static Context sContext;

    private AppContextUtil() {

    }

    public static void init(Context context) {
        sContext = context;
    }

    public static Context getInstance() {
        if (sContext == null) {
            throw new NullPointerException("the context is null.");
        }
        return sContext;
    }
}
