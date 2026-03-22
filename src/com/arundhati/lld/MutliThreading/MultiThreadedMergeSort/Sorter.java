package com.arundhati.lld.MutliThreading.MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;

    public Sorter(List<Integer> arrayToSort){
        this.arrayToSort=arrayToSort;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size()<=1){
            return arrayToSort;
        }
        int size = arrayToSort.size();
        int mid = size/2;
        List<Integer> leftToSort= new ArrayList<>();
        List<Integer> rightToSort= new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftToSort.add(arrayToSort.get(i));
        }
        for(int i=mid;i<size;i++){
            rightToSort.add(arrayToSort.get(i));
        }

        ExecutorService es = Executors.newCachedThreadPool();
        Sorter leftArrayToSort= new Sorter(leftToSort);
        Future<List<Integer>> resLeftSorted = es.submit(leftArrayToSort);

        Sorter rightArrayToSort = new Sorter(rightToSort);
        Future<List<Integer>> resRightSorted = es.submit(rightArrayToSort);

       List<Integer> sortedLeftArray =  resLeftSorted.get();
       List<Integer> sortedRightArray = resRightSorted.get();
       int i=0;
       int j=0;
       List<Integer> sortedArray = new ArrayList<>();
       while(i<sortedLeftArray.size() && j<sortedRightArray.size()){
           if(sortedLeftArray.get(i)<sortedRightArray.get(j)){
               sortedArray.add(sortedLeftArray.get(i));
               i++;
           }else if(sortedRightArray.get(j)<sortedLeftArray.get(i)){
               sortedArray.add(sortedRightArray.get(j));
               j++;
           }else {
               sortedArray.add(sortedLeftArray.get(i));
               i++;
               j++;
           }
       }
        while(i<sortedLeftArray.size()){
            sortedArray.add(sortedLeftArray.get(i));
            i++;
        }
        while(j<sortedRightArray.size()){
            sortedArray.add(sortedRightArray.get(j));
            j++;
        }

    return sortedArray;

    }
}

class Main{
    public static void main(String [] args) throws Exception {
        List<Integer> li = List.of(8,1,2,9,6,3,7,5);
        ExecutorService es = Executors.newCachedThreadPool();
        Sorter sort=new Sorter(li);
        //List<Integer> sortedArray = sort.call();
        Future<List<Integer>> sortedArrayFuture = es.submit(sort);

        List<Integer> sortedArray = sortedArrayFuture.get();

        for(Integer in : sortedArray){
            System.out.println(in);
        }
        es.close();
    }
}