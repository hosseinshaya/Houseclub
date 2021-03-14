package com.hosseinshaya.clubhouzeplus;

import android.app.Application;
import android.content.Context;

import me.grishka.appkit.utils.V;
import com.hosseinshaya.clubhouzeplus.api.ClubhouseSession;

public class App extends Application {
    public static Context applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = getApplicationContext();
        V.setApplicationContext(applicationContext);
        ClubhouseSession.load();
    }
}
