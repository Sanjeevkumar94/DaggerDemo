package com.example.diwithoutdagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SparkPlug sparkPlug = new SparkPlug();
        CrankShaft crankShaft = new CrankShaft();
        Piston piston = new Piston();
        Engine engine = new Engine(sparkPlug,crankShaft,piston);

        Rubber rubber = new Rubber();
        Frame  frame = new Frame();
        Wheel wheel = new Wheel(rubber,frame);

        Car hondaCar = new Car(engine);           //Constructor injection
        hondaCar.setWheel(wheel);                // Method injection
        hondaCar.mService = new Service();       // Field Injection
    }
}