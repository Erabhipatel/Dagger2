package com.app.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.app.dagger2.component.DaggerMobileComponent;
import com.app.dagger2.component.MobileComponent;
import com.app.dagger2.modules.BatteryModule;
import com.app.dagger2.modules.SnapDragonModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public Mobile mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileComponent component = DaggerMobileComponent.builder()
                .snapDragonModule(new SnapDragonModule(3))
                .batteryModule(new BatteryModule())
                .build();
        component.inject(this);
        mobile.start();
    }
}