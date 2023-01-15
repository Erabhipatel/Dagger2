package com.app.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class MediaTek implements Processor {

    @Inject
    public MediaTek() {
    }

    @Override
    public void start() {
        Log.i("TAG", "MediaTek start: ");
    }
}
