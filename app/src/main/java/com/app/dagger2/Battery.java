package com.app.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Battery {

    private Lithium lithium;
    private Cobalt cobalt;
    @Inject
    public Battery(Lithium lithium, Cobalt cobalt) {
        this.lithium = lithium;
        this.cobalt = cobalt;
        Log.i("TAG", "Battery: ");
    }
}
