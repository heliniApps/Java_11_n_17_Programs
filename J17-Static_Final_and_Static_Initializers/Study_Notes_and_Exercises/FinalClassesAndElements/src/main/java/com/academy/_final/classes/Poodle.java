package com.academy._final.classes;

/*
 * Below class declaration for 'Poodle1' causes COMPILE ERROR.
 * 'Dog' Class is marked as "final".
 * Hence, it cannot be sub-classed.
 */
// public class Poodle1 extends Dog { ... }

public class Poodle {

    private String name;
    private final String type;
    private final String family;

    public Poodle(String name, String type, String family) {
        this.name = name;
        this.type = type;
        this.family = family;
    }

    public void move() {
        System.out.println("Poodles have legs and, can walk");
    }
}
