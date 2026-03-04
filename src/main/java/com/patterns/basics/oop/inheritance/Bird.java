package com.patterns.basics.oop.inheritance;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " flies through the air.");
    }
}
