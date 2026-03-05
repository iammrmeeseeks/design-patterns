package com.patterns.basics.oop.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Bruno");
        Bird bird = new Bird("Sky");

        dog.eat();
        dog.move();
        dog.bark();

        bird.eat();
        bird.move();
    }
}
