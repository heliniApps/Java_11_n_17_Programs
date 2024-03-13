package com.academy;

public class AreaCalculator {

    /**
     * Calculates the area of a circle.
     *
     * @param radius radius of the circle, which area needs to be calculated.
     * @return area of the circle.
     */
    public static double area(double radius) {
        return (radius < 0) ? -1d : (radius * radius * Math.PI);
    }

    /**
     * Calculates the area of a rectangle.
     *
     * @param width  width of the rectangle.
     * @param height height of the rectangle.
     * @return area of the rectangle.
     */
    public static double area(double width, double height) {
        return (width < 0) || (height < 0) ? -1d : (width * height);
    }
}