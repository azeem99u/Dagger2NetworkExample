package com.example.diexample.basic;

import android.util.Log;

public class DataStorageHelper {

    private  boolean mPermission;
    private Transaction mTransaction;


    public DataStorageHelper(Transaction mTransaction) {
        this.mTransaction = mTransaction;
    }



    public void storeData(String data){

        if (mPermission){
            Log.d("mytag", "storeData: Storing data"+data +"at"+ mTransaction);
        }else {
            Log.d("mytag", "storeData: permission is not granted");
        }
    }

    public void setStoragePermission(boolean mPermission) {
        this.mPermission = mPermission;
        Log.d("mytag", "setStoragePermission: Storage permission ?"+mPermission);
    }
}
