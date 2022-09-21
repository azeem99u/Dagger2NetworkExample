package com.example.diexample.basic;

import javax.inject.Inject;

public class NetworkClient {

    private final Connection mConnection;

    @Inject
    public NetworkClient(Connection mConnection) {
        this.mConnection = mConnection;
    }

    //method injection
    @Inject
    public void attacheToNetworkTester(NetworkTester networkTester){
        networkTester.attachToNetwork(this);
    }

    public String fetchData(){

        return this.mConnection.doReq();
    }


}
