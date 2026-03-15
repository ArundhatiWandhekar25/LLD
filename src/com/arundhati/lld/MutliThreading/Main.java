package com.arundhati.lld.MutliThreading;

public class Main {
    public static void main(String []args){
       int a =10;
       int b= 20;
        HelloWorldPrinter tmp= new HelloWorldPrinter();
        Thread th= new Thread(tmp);
        th.start();

        System.out.println("Hello World " + Thread.currentThread().getName());

    }
}
