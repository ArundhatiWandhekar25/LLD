package com.arundhati.lld.MutliThreading.ProducerConsumerSemaphore;


import java.util.Set;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    private Store store;
    private Semaphore prodSem;
    private  Semaphore consSem;

    public Producer(Store store, Semaphore prodSem, Semaphore consSem){
        this.store=store;
        this.prodSem=prodSem;
        this.consSem=consSem;
    }

    @Override
    public void run(){
        while(true){
            try {
                prodSem.acquire();
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
            consSem.release();
        }
    }
}
