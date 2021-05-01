package com.example.diwithoutdagger;

import android.util.Log;

public class Engine {
    private SparkPlug sparkPlug;

    public Engine(SparkPlug sparkPlug){
        this.sparkPlug = sparkPlug;
        Log.d("tag","Engine Started");
    }
}
