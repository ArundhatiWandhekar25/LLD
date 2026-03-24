package com.arundhati.lld.MutliThreading.Mutex.AtomicDataTypes;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void>{

    private Value v;
    private Lock lock;

    public Adder(Value v, Lock lock){
        this.v=v;
        this.lock = lock;
    }
    @Override
    public Void call() throws Exception{
        for(int i=1;i<=100;i++){
            synchronized(v){
                this.v.atomicInteger.addAndGet(i);
                //System.out.println("Adder lock" + Thread.currentThread());
            }
        }
        return null;
    }
}
