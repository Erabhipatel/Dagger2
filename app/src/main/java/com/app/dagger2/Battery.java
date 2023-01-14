package com.app.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Battery {

    @Inject
    public Battery() {
        Log.i("TAG", "Battery: ");
    }
}
