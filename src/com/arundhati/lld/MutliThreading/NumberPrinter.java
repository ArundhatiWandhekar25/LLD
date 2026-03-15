/*Program to print number from 1-100 each from a separate thread*/

package com.arundhati.lld.MutliThreading;

public class NumberPrinter implements Runnable {
    private int num;
    NumberPrinter(int num){
        this.num=num;
    }

    @Override
    public void run() {
        System.out.println(num + " Number Printed By : " + Thread.currentThread().getName());
    }

}


class Client{
    public static void main(String [] args){

        for(int i=1;i<=100;i++){
            NumberPrinter np= new NumberPrinter(i);
            Thread th=new Thread(np);
            th.start();
        }


    }
}