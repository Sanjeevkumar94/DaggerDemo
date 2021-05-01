package com.example.diwithoutdagger.factoryMethods;

import com.example.diwithoutdagger.SparkPlug;

public class SparkPluginFactory {

    public  static SparkPlug getSparkPlug(){
        return new SparkPlug();
    }
}
