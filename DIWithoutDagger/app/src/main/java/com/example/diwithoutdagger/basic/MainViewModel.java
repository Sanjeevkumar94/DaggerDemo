package com.example.diwithoutdagger.basic;

import com.example.diwithoutdagger.network.NetworkClient;

import javax.inject.Inject;

public class MainViewModel {

//    private final NetworkClient mClient;

    @Inject
     NetworkClient mClient;

//    @Inject
//    public MainViewModel(NetworkClient networkClient) {
//        this.mClient = networkClient;
//    }//
//
    @Inject
    public MainViewModel() {
    }

    public String fetchData(){
        return mClient.fetchData();
    }

}


/*4 agar constructor injection humare class mein ho ri hogi toh field injection and method injection apne app
    perform ho jayegi.*/