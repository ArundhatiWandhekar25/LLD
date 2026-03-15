package com.arundhati.lld.MutliThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NumberPrinterPool {
    public static void main(String [] args){
        ExecutorService ex= Executors.newFixedThreadPool(10);
        ExecutorService ex1= Executors.newFixedThreadPool(10); //we can create mutliple pools of thread
        for(int i=1;i<=100;i++){
            NumberPrinter np=new NumberPrinter(i);
            ex.execute(np);
        }
    }
}
