package com.arundhati.lld.MutliThreading.AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value v;
    private Lock lock;

    public Subtractor(Value v, Lock lock){
        this.v=v;
        this.lock=lock;
    }

    @Override
    public Void call() throws  Exception{
        for(int i=1;i<=5000;i++) {
            synchronized (v) {
                v.value -= i;
                System.out.println("Subtractor lock" + Thread.currentThread());
            }
        }
        return null;
    }
}
