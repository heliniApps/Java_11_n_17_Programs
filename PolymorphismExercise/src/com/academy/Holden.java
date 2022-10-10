package com.academy;

public class Holden extends Car{

    public Holden(String name, int cylinders) {
        super(name, cylinders);
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
