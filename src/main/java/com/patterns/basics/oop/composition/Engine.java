package com.patterns.basics.oop.composition;

public class Engine {
    private final String type;

    public Engine(String type) {
        this.type = type;
    }

    public String start() {
        return type + " engine started";
    }
}
