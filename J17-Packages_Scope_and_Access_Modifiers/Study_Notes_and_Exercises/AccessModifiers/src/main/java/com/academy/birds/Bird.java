package com.academy.birds;

import com.academy.Animal;

public class Bird extends Animal {

    private String family;

    public Bird(String species, String family) {
        super("Bird", species);
        this.family = family;
    }

    public String getFamily() {
        return this.family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    protected void fly(boolean canFly, String flyMechanism) {
        super.move(flyMechanism);
        if (canFly) {
            System.out.println("The way this bird fly is: " + flyMechanism);
        } else {
            System.out.println("This bird cannot fly.");
        }
    }

    public void peck(String typeOfFood) {
        super.eat(typeOfFood);
        System.out.println("Birds peck their food.");
        System.out.println("This " + super.getSpecies() + " consumes a " + typeOfFood + " diet.");
    }
}
