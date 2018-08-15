package com.example.bojan.phoneregistrationlocation.base;

import android.app.Application;

import com.example.bojan.phoneregistrationlocation.utils.AppContextUtil;

/**
 * Create by bojan
 * on 2018/8/15
 */
public class MyAppApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AppContextUtil.init(this);

    }
}
