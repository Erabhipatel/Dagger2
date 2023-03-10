package com.app.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {
    private Battery battery;
    private Processor processor;

    @Inject
    public Mobile(Battery battery, Processor processor) {
        this.battery = battery;
        this.processor = processor;
        Log.i("TAG", "Mobile: ");
    }

    public void start(){
        Log.i("TAG", "run: ");
    }
}
