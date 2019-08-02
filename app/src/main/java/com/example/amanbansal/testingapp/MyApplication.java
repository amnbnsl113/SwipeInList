package com.example.amanbansal.testingapp;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {

    public static MyApplication myApplication;

    public static Context getContext() {
        return myApplication.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
    }

    public static MyApplication getMyApplication() {
        return myApplication;
    }
}
