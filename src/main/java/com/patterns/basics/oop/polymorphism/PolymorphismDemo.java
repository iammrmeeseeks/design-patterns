package com.patterns.basics.oop.polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(3.0),
            new Rectangle(4.0, 5.0)
        };

        for (Shape shape : shapes) {
            System.out.printf("%s area: %.2f%n", shape.name(), shape.area());
        }
    }
}
