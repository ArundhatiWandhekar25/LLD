package com.arundhati.lld.oops.Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String [] args){
        User u= new Student();
        u.setAge(24);
        u.setName("Arundhati");
        u.setGender("Feamle");
        //u.setPsp(90.1)  -> You cannot access psp using User reference. ❌ Compile Error!


        List<User> li = List.of(
                new Student(),
                new User(),
                new TA(),
                new Mentor()
        );
    }
}

/*
The reference type determines what you can access. The object type determines which method runs at runtime.



u (User reference)          Actual object in memory
knows only:                 contains:
        ┌──────────┐               ┌──────────┐
        │ name     │──────────────▶│ name     │
        │ age      │               │ age      │
        └──────────┘               │ psp      │ ← exists but u can't see!
        └──────────┘




which is better to create object
Student st=new Student()
User u=new Student()
-->Answer: User u = new Student() is better in most cases!
This follows a famous principle:

"Program to an interface/supertype, not to an implementation"

Advantages of User u = new Student()
1. Flexibility — Easy to change implementation
javaUser u = new Student(); // today
User u = new Teacher(); // tomorrow - just one line change! ✅
If you used Student st = new Student(), you would have to change everywhere Student is used.
2. Polymorphism works better
3. Loose Coupling


        */
