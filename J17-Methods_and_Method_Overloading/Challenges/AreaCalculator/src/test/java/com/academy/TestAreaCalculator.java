package com.academy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAreaCalculator {

    @Test
    void circleArea() {
        Assertions.assertEquals(78.53981633974483d, AreaCalculator.area(5d));
        Assertions.assertEquals(55.417694409323949d, AreaCalculator.area(4.2d));
        Assertions.assertEquals(-1.0d, AreaCalculator.area(-10d));
        Assertions.assertEquals(0.0, AreaCalculator.area(0));
    }

    @Test
    void rectangleArea() {
        Assertions.assertEquals(-1.0d, AreaCalculator.area(6d, -7d));
        Assertions.assertEquals(-1.0d, AreaCalculator.area(-4d, 5d));
        Assertions.assertEquals(-1.0d, AreaCalculator.area(-4d, -5.5d));

        Assertions.assertEquals(20d, AreaCalculator.area(4d, 5d));
        Assertions.assertEquals(42d, AreaCalculator.area(6d, 7d));
        Assertions.assertEquals(275.6502d, AreaCalculator.area(11.69d, 23.58d));
        Assertions.assertEquals(0.0, AreaCalculator.area(0, 23.58d));
        Assertions.assertEquals(0.0, AreaCalculator.area(56.7d, 0));
        Assertions.assertEquals(0.0, AreaCalculator.area(0, 0));
    }
}
