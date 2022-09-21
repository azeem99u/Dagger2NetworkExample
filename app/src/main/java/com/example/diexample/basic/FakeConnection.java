package com.example.diexample.basic;

import com.example.diexample.BuildConfig;

import javax.inject.Inject;

public class FakeConnection implements Connection{

    @Inject
    FakeConnection(){}

    @Override
    public String doReq() {
        return "this is testing Connection";
    }
}