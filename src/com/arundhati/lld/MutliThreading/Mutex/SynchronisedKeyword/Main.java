package com.arundhati.lld.MutliThreading.Mutex.SynchronisedKeyword;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String []args) throws ExecutionException, InterruptedException {

        Value v=new Value();

        Adder ad=new Adder(v);
        Subtractor sb=new Subtractor(v);
        ExecutorService es= Executors.newCachedThreadPool();

        Future<Void> AdderFuture =  es.submit(ad);
        Future<Void> subFuture = es.submit(sb);

        AdderFuture.get();
        System.out.println(v.value);
        subFuture.get();
        System.out.println(v.value);

    }
}
