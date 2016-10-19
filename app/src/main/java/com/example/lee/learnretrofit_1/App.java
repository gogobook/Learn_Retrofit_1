package com.example.lee.learnretrofit_1;

import android.app.Application;

/**
 * Created by lee on 2016/10/19.
 */

public class App extends Application {
    private static App INSTANCE;

    public static App getInstance() { return INSTANCE;}

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }
}
