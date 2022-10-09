package com.academy;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Basic Car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println();

        Car mitsubishi = new Mitsubishi("Mitsubishi Van", 6);
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        System.out.println();

        Car ford = new Ford("Ford Ranger", 6);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println();

        Car holden = new Holden("Holden AU", 7);
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        // Output::
        /*Car :: engine is starting.
        Car :: car is accelerating.
        Car :: brakes are applied.

        Mitsubishi :: engine is starting.
        Mitsubishi :: car is accelerating.
        Mitsubishi :: brakes are applied.

        Ford :: engine is starting.
        Ford :: car is accelerating.
        Ford :: brakes are applied.

        Holden :: engine is starting.
        Holden :: car is accelerating.
        Holden :: brakes are applied.*/

    }
}