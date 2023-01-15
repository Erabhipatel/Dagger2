package com.app.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class SnapDragon implements Processor {

    int clockSpeed;

    public SnapDragon(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    @Override
    public void start() {
        Log.i("TAG", "SnapDragon start with clockSpeed "+clockSpeed);
    }
}
