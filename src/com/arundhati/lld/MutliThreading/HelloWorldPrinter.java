package com.arundhati.lld.MutliThreading;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello Wolrd " + Thread.currentThread().getName());
    }
}
