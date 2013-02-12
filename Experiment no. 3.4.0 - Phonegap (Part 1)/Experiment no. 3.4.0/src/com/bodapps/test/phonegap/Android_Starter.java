package com.bodapps.test.phonegap;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.view.Menu;

/*
 * 
 * 			Project Name: Experiment no. 3.4.0 - PhoneGap Test (Part 1)
 * 			
 * 			Description:
 * 			   Purpose is to make a PhoneGap code by applying onto
 * 			the Android project. PhoneGap is used to  make  multi-
 * 			platform  device  that  makes  compatible  with  other
 * 			smartphone's OS such as iOS, Blackberry, Windows 8, 
 * 			etc.
 * 
 * 
 * 
 * 			*Created by David Dimalanta.
 * 
 */

public class Android_Starter extends DroidGap 
{
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html"); // --> Use this correct string value at all cost.
    }

    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_android__starter, menu);
        return true;
    }
}
