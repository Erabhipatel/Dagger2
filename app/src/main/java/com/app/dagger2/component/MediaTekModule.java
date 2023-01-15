package com.app.dagger2.component;

import com.app.dagger2.MediaTek;
import com.app.dagger2.Processor;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MediaTekModule {

    @Binds
    abstract Processor provideProcessor(MediaTek mediaTek);
}
