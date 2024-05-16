package com.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {

    @Test
    void getVolume() {

        Cuboid cuboid = new Cuboid(3, 4, 5);
        assertEquals(60, cuboid.getVolume());

        Cuboid cuboid2 = new Cuboid(3, 4, -5);
        assertEquals(0, cuboid2.getVolume());
    }
}