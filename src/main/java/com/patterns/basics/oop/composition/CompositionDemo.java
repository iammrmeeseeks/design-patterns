package com.patterns.basics.oop.composition;

public class CompositionDemo {
    public static void main(String[] args) {
        Engine engine = new Engine("Petrol");
        Car car = new Car("Sedan", engine);

        car.start();
    }
}
