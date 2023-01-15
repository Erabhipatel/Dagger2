package com.app.dagger2.component;

import com.app.dagger2.MainActivity;
import com.app.dagger2.MediaTek;
import com.app.dagger2.Mobile;
import com.app.dagger2.modules.BatteryModule;
import com.app.dagger2.modules.SnapDragonModule;

import dagger.Component;

@Component(modules = {BatteryModule.class, SnapDragonModule.class})
public interface MobileComponent {

    void inject(MainActivity mainActivity);

}
