package com.arundhati.lld.oops.Inheritance;

public class Student extends User{
    double psp;
    String batch;
    String name; // this is name attribute same as user attribute so student class will contains both user.userid and userid and user.name and name
    int userid;

    public void pauseBatch(){
        System.out.println(name + " is pausing batch");
        super.name="Arundhati"; // if we want to use parent class name attribute
        batch=null;
    }
}
