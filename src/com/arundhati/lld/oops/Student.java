package com.arundhati.lld.oops;

//In Java, only one public class is allowed per file, and the file name must match the public class name.
/*public class College {  // ❌ Error! Two public classes in one file
    String collegeName;
}*/

import javax.swing.*;

/*Access Modifiers :
Private: can access only within same class, No one can access outside.
Defaul: Can access within same class. can access from any other class in the same package.
Protected: can access within same class, any class within same package and can access from child class even in other package.
Public: Can access in same class, any where(inside class, even in diff packages) */

public class Student {
    public String name;
    public int age;

    //Default Constructor
    public Student(){
        System.out.println("Hello, This is Deafult Constructor");
    }

    //paramerised Constructor
    public Student(String name, int age){
        System.out.println("This is parameterised constructor");
        this.name=name;
        this.age=age;
    }

    //Copy Constructor
    public Student(Student s1, String name){
        System.out.println("This is Copy constructor");
        this.age=s1.age;
        this.name=name;
    }
}

class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Student s1 = new Student();
        Student s2 = new Student("Arundhati", 24);


        Student s3 = new Student(s2,"Pruthviraj");

        System.out.println("Default constructor values: "
                + s1.name + " " + s1.age);

        System.out.println("Parameterized constructor values: "
                + s2.name + " " + s2.age);


        System.out.println("Copy Constructor :" + s3.name + " " + s3.age);
    }
}
