package com.app.dagger2.component;

import com.app.dagger2.MainActivity;
import com.app.dagger2.Mobile;

import dagger.Component;

@Component
public interface MobileComponent {

    void inject(MainActivity mainActivity);

}
