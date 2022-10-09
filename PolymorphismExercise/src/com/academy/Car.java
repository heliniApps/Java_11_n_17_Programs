package com.academy;

public class Car {

    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return String.format("%1$s :: engine is starting.", this.getClass().getSimpleName());
    }

    public String accelerate() {
        return String.format("%1$s :: car is accelerating.", this.getClass().getSimpleName());
    }

    public String brake() {
        return String.format("%1$s :: brakes are applied.", this.getClass().getSimpleName());
    }
}
