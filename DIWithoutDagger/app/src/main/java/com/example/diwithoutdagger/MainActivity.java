package com.example.diwithoutdagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import static com.example.diwithoutdagger.factoryMethods.CarFactory.getCar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car hondaCar = getCar();
        hondaCar.driveCar();
    }
}