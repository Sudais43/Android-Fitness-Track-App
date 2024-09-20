package com.example.fitnesstrackapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Workout.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                        .applicationId("u0sNhVh6kKGU0hTuX0AtHYBTx33ZpU4WgykZElTC")
                        .clientKey("nlV1ApPx6Yoff45v33iMnMrva5IrB8rYS4JZZomK")
                        .server("https://parseapi.back4app.com")
                        .build()

                );
    }
}
