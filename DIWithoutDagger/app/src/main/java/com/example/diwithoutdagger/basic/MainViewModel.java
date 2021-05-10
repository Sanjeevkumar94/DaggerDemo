package com.example.diwithoutdagger.basic;

import com.example.diwithoutdagger.network.NetworkClient;

public class MainViewModel {

    private final NetworkClient mClient;

    public MainViewModel(NetworkClient networkClient) {
        this.mClient = networkClient;
    }

    public String fetchData(){
        return mClient.fetchData();
    }

}
