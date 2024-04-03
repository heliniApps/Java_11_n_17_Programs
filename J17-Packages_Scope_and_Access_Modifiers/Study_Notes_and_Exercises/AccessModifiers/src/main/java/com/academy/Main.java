package com.academy;

import com.academy.birds.Bird;
import com.academy.mammals.Bat;
import com.academy.mammals.Dog;

public class Main {

    public static void main(String[] args) {

        Dog zeus = new Dog("German Shepherd", "Zeus");
        zeus.bite("Carnivore");

        Bat fruitBat = new Bat();
        fruitBat.fly();

        Bird swan = new Bird("Swan", "Anatidae");
        swan.peck("Herbivore");
        /* swan.fly(); */  // Does NOT have access to 'protected' method from a different package.
    }
}
