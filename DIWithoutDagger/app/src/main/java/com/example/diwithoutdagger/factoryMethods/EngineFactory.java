package com.example.diwithoutdagger.factoryMethods;

import com.example.diwithoutdagger.Engine;

import static com.example.diwithoutdagger.factoryMethods.SparkPluginFactory.getSparkPlug;

public class EngineFactory {

    public  static Engine getEngine(){
        return new Engine(getSparkPlug());
    }
}
