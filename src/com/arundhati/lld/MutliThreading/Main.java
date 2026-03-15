package com.arundhati.lld.MutliThreading;

public class Main {
    public static void main(String []args){
        System.out.println("Hello World " + Thread.currentThread().getName());

        HelloWorldPrinter tmp= new HelloWorldPrinter();
        Thread th= new Thread(tmp);
        th.start();
    }
}
