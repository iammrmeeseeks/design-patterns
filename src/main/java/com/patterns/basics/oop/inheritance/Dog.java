package com.patterns.basics.oop.inheritance;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " runs on four legs.");
    }

    public void bark() {
        System.out.println(getName() + " says: Woof!");
    }
}
