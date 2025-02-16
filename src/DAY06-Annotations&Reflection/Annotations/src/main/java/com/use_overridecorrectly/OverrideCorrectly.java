/*
Use @Override Correctly
✅ Problem Statement:
Create a parent class Animal with a method makeSound(). Then, create a Dog class that overrides this method using @Override.
🔹 Steps to Follow:
Define a makeSound() method in Animal class.
Override it in Dog class with @Override.
Instantiate Dog and call makeSound().
*/

package com.use_overridecorrectly;

// Parent class
class Animal {
    void makeSound() {  // Base method
        System.out.println("Animal makes a sound");
    }
}

// Child class overriding makeSound()
class Dog extends Animal {
    @Override
    void makeSound() {  // Proper override
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Main class to test
public class OverrideCorrectly {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polymorphism
        myDog.makeSound(); // Calls the overridden method in Dog
    }
}
