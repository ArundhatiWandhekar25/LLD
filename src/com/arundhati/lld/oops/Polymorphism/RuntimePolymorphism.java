package com.arundhati.lld.oops.Polymorphism;


public class RuntimePolymorphism {
    public static void main(String[] args) {
        // Superclass reference pointing to Subclass object
        Animal myDog = new Dog();

        // At runtime, the JVM decides to call the Dog's version of the method
        myDog.makeSound();
    }
}

class Animal {
    // Changed 'do' to 'makeSound' because 'do' is a reserved keyword
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
