package com.example.diwithoutdagger;

import android.util.Log;

public class Car {

    private final Engine engine;
    private Wheel wheel;
    public  Service mService;

    public Car(Engine engine, Wheel wheel) {      // Constructor Injection
        this.engine = engine;
        this.wheel = wheel;
    }

    public  void  driveCar(){
        Log.d("tag","drive:vhroooom: Car is driving");
        wheel.inflateWheel();
    }
}
