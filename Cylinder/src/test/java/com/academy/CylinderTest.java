package com.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getVolume() {

        Cylinder cylinder = new Cylinder(5.5, 4);
        assertEquals(380.132711084364953, cylinder.getVolume());

        Cylinder cylinder2 = new Cylinder(5.5, -4);
        assertEquals(0, cylinder2.getVolume());
    }
}