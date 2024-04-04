package com.academy._final.methods;

public class Bird extends Animal {

    public Bird(String species) {
        super("Bird", species);
    }

    @Override
    public void eat() {
        System.out.println("Birds peck their food.");
    }

    public void fly() {
        /*
         * Below call to "super.move()" is VALID, as it doesn't override the original method.
         */
        super.move();

        System.out.println("Birds have wings. So they fly.");
    }

    /*
     * Below Override statement is INVALID and causes COMPILE ERROR.
     * "move()" method is marked as "final" in the 'super' class (Animal).
     */
    // @Override
    // public void move() {  }
}
