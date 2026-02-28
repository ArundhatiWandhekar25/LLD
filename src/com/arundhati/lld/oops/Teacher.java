package com.arundhati.lld.oops;

/*Pass by Value — a copy of the variable is passed. Changes inside method do NOT affect original.
Pass by Reference — the actual reference/address is passed. Changes inside method DO affect original.
Java is ALWAYS Pass by Value!
This is the most important thing to remember. Java never passes by reference.
But wait — then why do changes to objects reflect outside the method? Let's understand this clearly.*/
public class Teacher {
    String name;
    static void change(Teacher s) {
        s=new Teacher();//Reassigning object to new object inside method → does NOT reflect outside ✅
        s.name = "Rahul";
    }

    public static void main(String[] args) {
        Teacher s1 = new Teacher();
        s1.name = "John";
        change(s1);
        System.out.println(s1.name); // John ✅ NOT changed!
    }
}

/*
Java is always pass by value. For primitives, value is copied. For objects, the reference is copied (not the actual object),
 so field changes reflect outside but reassignment does not.
*/
