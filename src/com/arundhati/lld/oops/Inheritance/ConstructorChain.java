package com.arundhati.lld.oops.Inheritance;
/*Parent constructor is called first, then child constructor!

Why does this happen?
Because Java implicitly adds super() as the first statement in child constructor if you don't write it!*/

class A {
    A() { System.out.println("A constructor"); }
}
class B extends A {
    B() { System.out.println("B constructor"); }
}
class C extends B {
    C() { System.out.println("C constructor"); }
}
class D extends C {
    D() { System.out.println("D constructor"); }
}

public class ConstructorChain {
    public static void main(String[] args) {
        D d = new D();
    }
}


/*
**Output:**
        ```
A constructor
B constructor
C constructor
D constructor

*
* 
What if Parent has no default constructor?
Then you MUST explicitly call super() with arguments in child constructor!
* */


class Animal1 {
    String name;

    Animal1(String name) {  // parameterized constructor only
        this.name = name;
    }
}

class Dog2 extends Animal1 {
    String breed;

    Dog2(String name, String breed) {
        super(name); // ✅ must call explicitly!
        this.breed = breed;
    }
}