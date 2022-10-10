package com.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {

        Rectangle rect = new Rectangle(3, 4);
        assertEquals(12, rect.getArea());

        Rectangle rect2 = new Rectangle(-2, 4);
        assertEquals(0, rect2.getArea());
    }
}