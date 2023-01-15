package com.app.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class SnapDragon implements Processor {

    @Inject
    public SnapDragon() {
    }

    @Override
    public void start() {
        Log.i("TAG", "SnapDragon start: ");
    }
}
