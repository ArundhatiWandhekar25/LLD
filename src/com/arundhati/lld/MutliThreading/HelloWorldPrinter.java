package com.arundhati.lld.MutliThreading;

import javax.swing.plaf.TableHeaderUI;

public class HelloWorldPrinter implements Runnable{

    void doSomething(){
        System.out.println("Hello World From DoSomething " + Thread.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println("Hello Wolrd " + Thread.currentThread().getName());
        doSomething();
    }
}
