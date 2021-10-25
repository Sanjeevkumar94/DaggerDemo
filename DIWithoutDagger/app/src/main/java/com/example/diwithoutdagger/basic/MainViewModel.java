package com.example.diwithoutdagger.basic;

import com.example.diwithoutdagger.network.NetworkClient;
import com.example.diwithoutdagger.utils.DataStorageHelper;

import javax.inject.Inject;

public class MainViewModel {

    private final NetworkClient mClient;
    private final DataStorageHelper mDataStorageHelper;

    @Inject
    public MainViewModel(NetworkClient networkClient,
                         DataStorageHelper dataStorageHelper) {
        this.mClient = networkClient;
        this.mDataStorageHelper = dataStorageHelper;
    }

    public String fetchData(){
        String data = mClient.fetchData();
        mDataStorageHelper.storeData(data);
        return data;
    }

}
