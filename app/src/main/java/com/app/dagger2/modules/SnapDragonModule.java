package com.app.dagger2.modules;

import com.app.dagger2.Processor;
import com.app.dagger2.SnapDragon;

import dagger.Module;
import dagger.Provides;

@Module
public class SnapDragonModule {

    int clockSpeed;

    public SnapDragonModule(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    @Provides
    int provideClockSpeed(){
        return clockSpeed;
    }

    @Provides
    Processor provideProcessor(SnapDragon snapdragon){
        return snapdragon;
    }
}
