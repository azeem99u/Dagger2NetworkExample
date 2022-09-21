package com.example.diexample.di;

import com.example.diexample.basic.Connection;
import com.example.diexample.basic.RealConnection;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class RealConnectionModule {

//    String endPoint;
//
//    public RealConnectionModule(String endPoint){
//        this.endPoint = endPoint;
//    }


    @Provides
    Connection provideConnection(RealConnection connection ){
        return connection;
    }
}
