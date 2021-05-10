package com.example.diwithoutdagger.basic;

import com.example.diwithoutdagger.network.NetworkClient;

import javax.inject.Inject;

public class MainViewModel {

    private final NetworkClient mClient;

    @Inject
    public MainViewModel(NetworkClient networkClient) {
        this.mClient = networkClient;
    }

    public String fetchData(){
        return mClient.fetchData();
    }

}
