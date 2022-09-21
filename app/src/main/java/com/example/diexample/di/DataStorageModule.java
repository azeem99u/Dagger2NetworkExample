package com.example.diexample.di;

import com.example.diexample.basic.DataStorageHelper;
import com.example.diexample.basic.Transaction;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DataStorageModule {

    @Provides
    public static Transaction providerTransaction(){
        return new Transaction(System.currentTimeMillis());
    }

    @Provides
    public static DataStorageHelper providerDataStorageHelper(Transaction transaction){
        DataStorageHelper dataStorageHelper = new DataStorageHelper(transaction);
        dataStorageHelper.setStoragePermission(true);
        return dataStorageHelper;
    }



}
