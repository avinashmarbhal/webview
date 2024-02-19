package com.RahuriMarket.rahurimarket;

import android.app.Application;

import com.onesignal.OneSignal;

public class RahuriMarket extends Application {
    private static final String ONESIGNAL_APP_ID = "703361e3-2afa-4d28-a9d2-0cf3134ab8c2";

    @Override
    public void onCreate() {
        super.onCreate();
        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}
