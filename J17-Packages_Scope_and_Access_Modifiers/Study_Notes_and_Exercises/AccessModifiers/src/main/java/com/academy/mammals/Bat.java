package com.academy.mammals;

import com.academy.Animal;
import com.academy.birds.Bird;

public class Bat extends Animal {

    public Bat() {
        super("Mammal", "Bat");
    }

    public void fly() {
        Bird bat = new Bird("Bat", "Chiroptera");
        /*
         * "fly()" method has 'protected' access in "com.academy.birds" package.
         * Also, this "Bat" class is not a subclass of the "Bird" class.
         * Therefore, doesn't have access to "fly()" method within this "Bat" class.
         */
        // bat.fly(true, "uses fore-arm wings");
    }
}
