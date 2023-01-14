package com.app.dagger2.modules;

import com.app.dagger2.Battery;
import com.app.dagger2.Cobalt;
import com.app.dagger2.Lithium;

import dagger.Module;
import dagger.Provides;

@Module
public class BatteryModule {

    @Provides
    Lithium provideLithium(){
        return new Lithium();
    }

    @Provides
    Cobalt provideCobalt(){
        return new Cobalt();
    }

    @Provides
    Battery provideBattery(Lithium lithium, Cobalt cobalt){
        return new Battery(lithium, cobalt);
    }
}
