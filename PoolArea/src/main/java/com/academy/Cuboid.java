package com.academy;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);

        this.height = 0;
        if (height >= 0) {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return (getArea() * getHeight());
    }
}
