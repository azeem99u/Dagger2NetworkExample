package com.example.diexample.basic;

import android.util.Log;

import javax.inject.Inject;

public class NetworkTester {
    @Inject
    public NetworkTester() {
    }

    void attachToNetwork(NetworkClient networkClient){
        Log.d("mytag", "attached To Network: ");
    }
}
