package com.app.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Processor {

    @Inject
    public Processor() {
        Log.i("TAG", "Processor: ");
    }
}
