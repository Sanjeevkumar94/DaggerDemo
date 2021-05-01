package com.example.diwithoutdagger;

import android.util.Log;

public class Wheel {
    private Rubber rubber;
    public Wheel(Rubber rubber) {
        rubber = rubber;
    }

    public void inflateWheel(){
        Log.d("tag","inflated wheel");
    }

}
