package com.arundhati.lld.MutliThreading.ProducerConsumerSemaphore;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {

    private int maxSize;
    private ConcurrentLinkedDeque<Object> items;

    public Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void addItem() {
        this.items.add(new Object());
        System.out.println("Item Produced. New Count: " + this.items.size());
    }

    public void removeItem() {
        Object removed = this.items.pollLast();
        if (removed != null) {
            System.out.println("Item Consumed. New Count: " + this.items.size());
        }
    }
}