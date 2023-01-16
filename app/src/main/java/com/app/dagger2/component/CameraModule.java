package com.app.dagger2.component;

import com.app.dagger2.Camera;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class CameraModule {

    @Provides
    static Camera providesCamera(@Named("pixel")int pixel){
        return new Camera(pixel);
    }
}
