package com.arundhati.lld.MutliThreading.Mutex.AtomicDataTypes;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String []args) throws ExecutionException, InterruptedException {

        Value v=new Value();
        Lock lock=new ReentrantLock();

        Adder ad=new Adder(v, lock);
        Subtractor sb=new Subtractor(v,lock);
        ExecutorService es= Executors.newCachedThreadPool();

        Future<Void> AdderFuture =  es.submit(ad);
        Future<Void> subFuture = es.submit(sb);

        AdderFuture.get();
        System.out.println(v);
        subFuture.get();
        System.out.println(v);

    }
}
