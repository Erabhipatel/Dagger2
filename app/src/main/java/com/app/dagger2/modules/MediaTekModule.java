package com.app.dagger2.modules;

import com.app.dagger2.MediaTek;
import com.app.dagger2.Processor;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MediaTekModule {

    @Binds
    abstract Processor provideProcessor(MediaTek mediaTek);
}
