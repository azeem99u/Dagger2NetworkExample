package com.example.diexample.di;

import com.example.diexample.basic.Connection;
import com.example.diexample.basic.FakeConnection;
import com.example.diexample.basic.RealConnection;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public interface FakeConnectionModule {
    @Binds
    Connection provideConnection(FakeConnection connection);
}
