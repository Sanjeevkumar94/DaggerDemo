package com.example.diwithoutdagger.network;

import android.util.Log;

import javax.inject.Inject;

import static com.example.diwithoutdagger.basic.Constants.MY_TAG;

public class NetworkTester {

    @Inject
    public NetworkTester(){

    }

    public  void attachToNetwork(NetworkClient networkClient){
        Log.d(MY_TAG,"attached to n/w");
    }
}
