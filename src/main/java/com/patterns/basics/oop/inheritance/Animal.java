package com.patterns.basics.oop.inheritance;

public class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void move() {
        System.out.println(name + " moves in a general way.");
    }
}
