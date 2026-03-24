package com.arundhati.lld.MutliThreading.ProducerConsumerSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String [] args){
        ExecutorService es = Executors.newCachedThreadPool();
        Store store= new Store(5);
        Semaphore prodSem =  new Semaphore(5);
        Semaphore consSem = new Semaphore(0);

        for(int i=1;i<=8;i++){
            es.execute(new Producer(store, prodSem , consSem));
        }

        for(int i=1;i<=8;i++){
            es.execute(new Consumer(store, prodSem , consSem));
        }
    }
}
