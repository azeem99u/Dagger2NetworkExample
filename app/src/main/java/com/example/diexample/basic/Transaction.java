package com.example.diexample.basic;


public class Transaction {
    private long mTime;

    public Transaction(long mTime) {
        this.mTime = mTime;
    }

    @Override
    public String toString() {
        return String.valueOf(mTime);
    }
}
