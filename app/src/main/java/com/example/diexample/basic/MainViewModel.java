package com.example.diexample.basic;

import javax.inject.Inject;

public class MainViewModel {

    private final NetworkClient mClient;
    private final DataStorageHelper mDataStorageHelper;
    @Inject
    public MainViewModel(NetworkClient mClient, DataStorageHelper mDataStorageHelper){
        this.mClient = mClient;
        this.mDataStorageHelper = mDataStorageHelper;
    }
    public String fetchData(){

        String data = mClient.fetchData();
        mDataStorageHelper.storeData(data);
        return data;
    }
}
