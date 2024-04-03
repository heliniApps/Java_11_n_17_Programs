package com.academy.mammals;

import com.academy.Animal;

public class Dog extends Animal {

    private String family;
    private String name;

    public Dog(String family, String name) {
        super("Mammal", "Dog");
        this.family = family;
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
     * This 'move' method is an overridden from the super class.
     * Original method in super class has 'protected' access modifier.
     * Therefore, unable to assign access modifiers stricter than the super class's method.
     *
     * Cannot assign ->  'package-private (default)' or 'private'.
     * Only allowed ->  'protected' (same as super class) or 'public'.
     */
    @Override
    public void move(String moveMechanism) {
        super.move(moveMechanism);
        System.out.println("Dogs have 4 legs and they, " + moveMechanism);
    }

    public void bite(String typeOfFood) {
        super.eat(typeOfFood);
        System.out.println("Dogs bite their food.");
    }
}
