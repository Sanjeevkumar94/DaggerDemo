package com.example.diwithoutdagger;

import android.util.Log;

public class Car {

    private final Engine engine;
    private Wheel wheel;
    public  Service mService;

    public Car(Engine engine) {      // Constructor Injection
        this.engine = engine;
    }


    public void setWheel (Wheel wheel){      //     Method Injection
        this.wheel = wheel;
    }
    public  void  driveCar(){
        Log.d("tag","drive:vhroooom: Car is driving");
    }
}
