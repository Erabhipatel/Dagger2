package com.app.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {

    @Inject
    Battery battery;
    private Processor processor;

    @Inject
    public Mobile(Processor processor) {
        this.processor = processor;
        Log.i("TAG", "Mobile: ");
    }

    @Inject
    void connectCharger(Charger charger){
        charger.setCharger(this);
    }

    public void start(){
        Log.i("TAG", "run: ");
    }
}
