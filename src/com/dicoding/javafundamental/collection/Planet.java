package com.dicoding.javafundamental.collection;

public class Planet {
    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    private String name;
    private double mass;

    @Override
    public String toString() {
        return "Planet " + name + mass;
    }
}
