package com.example.diwithoutdagger.network;

import javax.inject.Inject;

public class NetworkClient {

    private final NetworkConnection mConnection;

    @Inject
    public NetworkClient(NetworkConnection connection) {
        this.mConnection = connection;
    }

    @Inject
    public String fetchData(){
        return mConnection.doReq();
    }

    @Inject
    public void attachToNWConnection(NetworkTester networkTester){            //Method Injection
        networkTester.attachToNetwork(this);
    }
}


// 1.Method injection mein hume call krni ki need ni hai method ko dagger khud ise call krta hai
// 2. Method calls jis order mein likha hai vese call hote hai but it is not gaurantee ki voh vse call honge
