package com.app.dagger2.modules;

import com.app.dagger2.Processor;
import com.app.dagger2.SnapDragon;

import dagger.Module;
import dagger.Provides;

@Module
public class SnapDragonModule {

    @Provides
    Processor provideProcessor(SnapDragon snapDragon){
        return snapDragon;
    }
}
