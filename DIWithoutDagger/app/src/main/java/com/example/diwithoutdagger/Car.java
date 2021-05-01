package com.example.diwithoutdagger;

import android.util.Log;

public class Car {

    private Engine engine;
    private Wheel wheel;

    public Car(Engine engine,Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public  void  driveCar(){
        Log.d("tag","drive:vhroooom: Car is driving");
    }
}
