package com.example.diwithoutdagger.factoryMethods;

import com.example.diwithoutdagger.Car;

import static com.example.diwithoutdagger.factoryMethods.EngineFactory.getEngine;
import static com.example.diwithoutdagger.factoryMethods.WheelFactory.getWheel;

public class CarFactory {

    public static Car getCar() {
        return new Car(getEngine(), getWheel());
    }


}
