package com.academy._final.classes;

public final class Dog {

    private String name;
    private final String type;
    private final String family;

    public Dog(String name, String type, String family) {
        this.name = name;
        this.type = type;
        this.family = family;
    }

    public void move() {
        System.out.println("Dogs can walk");
    }
}
