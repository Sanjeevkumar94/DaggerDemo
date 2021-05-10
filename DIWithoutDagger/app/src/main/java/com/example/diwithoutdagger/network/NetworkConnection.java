package com.example.diwithoutdagger.network;

import com.example.diwithoutdagger.BuildConfig;
import com.example.diwithoutdagger.basic.Constants;

public class NetworkConnection {

    private final String mEndpoint;
    public NetworkConnection(){

        if(BuildConfig.DEBUG){
            this.mEndpoint= Constants.DEBUG_ENDPOINT;
        }else {
            this.mEndpoint=Constants.PROD_ENDPOINT;
        }

    }
    public String doReq() {
        return this.mEndpoint;
    }

}
