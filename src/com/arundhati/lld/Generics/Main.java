package com.arundhati.lld.Generics;

public class Main {
    public static void main(String [] args){
        Pair<Double, Double> p1= new Pair<>(10.5, 30.5);
        Pair<String , String > p2= new Pair<>("Hi","Hello");

        double a = p1.getFirst();
        String b = p2.getFirst();
    }
}
