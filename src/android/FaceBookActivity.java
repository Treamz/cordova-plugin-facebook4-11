package org.apache.cordova.facebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class FaceBookActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Toast.makeText(this, "123", Toast.LENGTH_SHORT).show();
        Intent intent = getIntent();
        String fbAppId = intent.getStringExtra("FBID");
        FacebookSdk.setApplicationId(fbAppId);
        FacebookSdk.sdkInitialize(FaceBookActivity.this);
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);
        FacebookSdk.fullyInitialize();
        AppEventsLogger.activateApp(getApplication());
        finish();
    }
}