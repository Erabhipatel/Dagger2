package com.app.dagger2.component;

import com.app.dagger2.MainActivity;
import com.app.dagger2.MediaTek;
import com.app.dagger2.Mobile;
import com.app.dagger2.modules.BatteryModule;
import com.app.dagger2.modules.MediaTekModule;
import com.app.dagger2.modules.SnapDragonModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {BatteryModule.class, MediaTekModule.class, CameraModule.class})
public interface MobileComponent {

    void inject(MainActivity mainActivity);

//    @Component.Builder
//    interface Builder{
//
//        @BindsInstance
//        Builder setClockSpeed(@Named("clockSpeed") int clockSpeed);
//
//        @BindsInstance
//        Builder setCore(@Named("core")int core);
//
//        MobileComponent build();
//    }

    @Component.Factory
    interface Factory {

        MobileComponent create(@BindsInstance @Named("clockSpeed") int clockSpeed,
                               @BindsInstance @Named("core")int core,
                               @BindsInstance @Named("pixel")int pixel);
    }

}
