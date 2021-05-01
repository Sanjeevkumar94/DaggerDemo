package com.example.diwithoutdagger.factoryMethods;

import com.example.diwithoutdagger.Wheel;

import static com.example.diwithoutdagger.factoryMethods.RubberFactory.getRubber;

public class WheelFactory {

    public static Wheel getWheel(){
        return new Wheel(getRubber());
    }
}
