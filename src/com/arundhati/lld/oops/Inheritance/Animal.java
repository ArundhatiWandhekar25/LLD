package com.arundhati.lld.oops.Inheritance;

/*Inheritance is a mechanism where a child class acquires properties and methods of a parent class.
It promotes code reusability — write once, use everywhere!
Keyword used is "extends"
Inheritance is a IS-A relationship
It means the child class IS A type of parent class.
*/

public class Animal {
    String name;

    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Tommy";     // inherited ✅
        d.eat();              // inherited ✅
        d.sleep();            // inherited ✅
        d.bark();             // own method ✅
    }
}

/*
In an inheritance chain, the topmost parent class has the highest level of abstraction because it is the most general,
and child classes become more specific as we go down.


A  ←── Highest Abstraction (most general)
↑
B
↑
C
↑
D  ←── Lowest Abstraction (most specific)*/
