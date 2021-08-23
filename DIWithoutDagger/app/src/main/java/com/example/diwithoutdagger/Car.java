package com.example.diwithoutdagger;

import android.util.Log;

public class Car {

    private Engine engine;
    private Wheel wheel;
    public ServiceCar service;      //Field Injection

    public Car(Engine engine) {                     // Constructor injection
        this.engine = engine;
    }

    public void setWheel(Wheel wheel) {              //Wheel injection
        this.wheel = wheel;
    }

    public  void  driveCar(){
        Log.d("tag","drive:vhroooom: Car is driving");
    }
}
