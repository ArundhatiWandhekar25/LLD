package com.arundhati.lld.MutliThreading.Mutex.SynchronizedMethod;

public class Value {
   private int value=0;

   public int getValue(){
      return value;
   }
   public synchronized void incrementBy(int num){
      this.value+=num;
   }

   public synchronized void decrementBy(int num){
      this.value-=num;
   }
}
