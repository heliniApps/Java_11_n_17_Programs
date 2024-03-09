package com.academy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestBarkingDog {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void shouldWakeUp() {
        Assertions.assertTrue(BarkingDog.shouldWakeUp(true, 23));
        Assertions.assertTrue(BarkingDog.shouldWakeUp(true, 0));
        Assertions.assertTrue(BarkingDog.shouldWakeUp(true, 1));
        Assertions.assertTrue(BarkingDog.shouldWakeUp(true, 2));
        Assertions.assertTrue(BarkingDog.shouldWakeUp(true, 7));
        // Using Supplier.
        Assertions.assertTrue(() -> BarkingDog.shouldWakeUp(true, 6));

        Assertions.assertFalse(BarkingDog.shouldWakeUp(true, 8));
        Assertions.assertFalse(BarkingDog.shouldWakeUp(true, 9));
        Assertions.assertFalse(BarkingDog.shouldWakeUp(true, 22));
        Assertions.assertFalse(BarkingDog.shouldWakeUp(true, 21));
        Assertions.assertFalse(BarkingDog.shouldWakeUp(true, 12));
        Assertions.assertFalse(BarkingDog.shouldWakeUp(false, 0));
        Assertions.assertFalse(BarkingDog.shouldWakeUp(false, 23));
        Assertions.assertFalse(BarkingDog.shouldWakeUp(false, 7));
        Assertions.assertFalse(BarkingDog.shouldWakeUp(false, 6));
        Assertions.assertFalse(BarkingDog.shouldWakeUp(false, 1));

        Assertions.assertFalse(BarkingDog.shouldWakeUp(false, -1));
        Assertions.assertFalse(BarkingDog.shouldWakeUp(true, -23));
        Assertions.assertFalse(BarkingDog.shouldWakeUp(true, -7));
    }
}