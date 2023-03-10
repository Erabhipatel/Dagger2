package com.app.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.app.dagger2.component.DaggerMobileComponent;
import com.app.dagger2.component.MobileComponent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileComponent component = DaggerMobileComponent.create();
        Mobile mobile = component.getMobile();
        mobile.start();
    }
}