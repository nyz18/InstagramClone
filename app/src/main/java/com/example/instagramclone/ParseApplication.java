package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

        //initialize parse sdk as soon as app is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("T5AnBHbEA5Yf2IAJLu9NVC2zLpBAPZQLWi08aaNj")
                .clientKey("bWMiN5JMlgisN3jhsy098L06W7UfXR4GpSMTsRde")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
