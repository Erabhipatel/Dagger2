package com.app.dagger2;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class MediaTek implements Processor {

    int clockSpeed;
    int core;

    @Inject
    public MediaTek(@Named("clockSpeed")int clockSpeed, @Named("core")int core) {
        this.clockSpeed = clockSpeed;
        this.core = core;
    }

    @Override
    public void start() {
        Log.i("TAG", "MediaTek start with clockSpeed "+clockSpeed+" and core "+core);
    }
}
