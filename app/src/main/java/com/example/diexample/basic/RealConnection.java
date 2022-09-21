package com.example.diexample.basic;

import com.example.diexample.BuildConfig;

import javax.inject.Inject;
import javax.inject.Named;

public class RealConnection implements Connection{


    private String mEndPoint;
    private String username;
    private String password;



    @Inject
    public RealConnection(@Named ("endPoint") String mEndPoint,
                          @Named ("username") String username,
                          @Named ("password")String password){
        this.mEndPoint = mEndPoint;
        this.username = username;
        this.password = password;

//        if (BuildConfig.DEBUG){
//           this.mEndPoint = Constants.DEBUG_ENDPOINT;
//        }else {
//           this.mEndPoint= Constants.PROD_ENDPOINT;
//        }
    }

    @Override
    public String doReq() {
        return "\n"+mEndPoint+"\n"+username+"\n"+password;
    }
}