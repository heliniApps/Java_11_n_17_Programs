package com.academy;

public class Main {

    public static void main (String[] args) {

        Addition ad = new Addition("Lettus", 6);
        BasicBurger healthyBurger = new HealthyBurger(
                new Meat("Chicken", 5),
                ad,
                new Addition("Tomato", 1),
                null,
                null,
                new Addition("Spinach", 3),
                null);

        System.out.println("healthyBurger.getPrice() = " + healthyBurger.getPrice());

        BasicBurger deluxeBurger = new DeluxeBurger(
                new BreadRoll("White bread roll", 5),
                new Meat("Beef", 3));

        System.out.println("\ndeluxeBurger.getPrice() = " + deluxeBurger.getPrice());
        deluxeBurger.printItems();

    }
}
