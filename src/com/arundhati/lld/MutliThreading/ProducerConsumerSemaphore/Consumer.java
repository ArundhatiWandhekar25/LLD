package com.arundhati.lld.MutliThreading.ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Store store;
    private Semaphore prodSem;
    private  Semaphore consSem;


    public Consumer(Store store, Semaphore prodSem, Semaphore consSem){
        this.store=store;
        this.store=store;
        this.prodSem=prodSem;
        this.consSem=consSem;
    }

    @Override
    public void run(){
        while (true){
            try {
                consSem.acquire();
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            prodSem.release();
        }
    }
}
