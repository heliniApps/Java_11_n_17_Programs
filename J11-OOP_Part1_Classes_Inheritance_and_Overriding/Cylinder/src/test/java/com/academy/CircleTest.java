package com.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {

        Circle circle = new Circle(5.5);
        assertEquals((Math.PI * 5.5 * 5.5), circle.getArea());

        Circle circle2 = new Circle(-5.5);
        assertEquals(0, circle2.getArea());
    }
}