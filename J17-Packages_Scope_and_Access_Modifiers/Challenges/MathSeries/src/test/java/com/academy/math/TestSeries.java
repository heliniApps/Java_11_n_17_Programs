package com.academy.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestSeries {

    @Test
    void nSum() {
        Assertions.assertEquals(-1, Series.nSum(-1));
        Assertions.assertEquals(-1, Series.nSum(-2));
        Assertions.assertEquals(-1, Series.nSum(-10));
        Assertions.assertEquals(-1, Series.nSum(-86));

        Assertions.assertEquals(0, Series.nSum(0));
        Assertions.assertEquals(1, Series.nSum(1));
        Assertions.assertEquals(3, Series.nSum(2));
        Assertions.assertEquals(6, Series.nSum(3));
        Assertions.assertEquals(10, Series.nSum(4));
        Assertions.assertEquals(15, Series.nSum(5));
        Assertions.assertEquals(21, Series.nSum(6));
        Assertions.assertEquals(28, Series.nSum(7));
        Assertions.assertEquals(36, Series.nSum(8));
        Assertions.assertEquals(45, Series.nSum(9));
        Assertions.assertEquals(55, Series.nSum(10));
        Assertions.assertEquals(2850, Series.nSum(75));
        // Assertions.assertEquals(2305843008139952128L, Series.nSum(Integer.MAX_VALUE));
    }

    @Test
    void factorial() {
        Assertions.assertEquals(-1, Series.factorial(-1));
        Assertions.assertEquals(-1, Series.factorial(-10));
        Assertions.assertEquals(-1, Series.factorial(-55));

        Assertions.assertEquals(1, Series.factorial(0));
        Assertions.assertEquals(1, Series.factorial(1));
        Assertions.assertEquals(2, Series.factorial(2));
        Assertions.assertEquals(6, Series.factorial(3));
        Assertions.assertEquals(24, Series.factorial(4));
        Assertions.assertEquals(120, Series.factorial(5));
        Assertions.assertEquals(720, Series.factorial(6));
        Assertions.assertEquals(5040, Series.factorial(7));
        Assertions.assertEquals(40320, Series.factorial(8));
        Assertions.assertEquals(362880, Series.factorial(9));
        Assertions.assertEquals(3628800, Series.factorial(10));
        // Assertions.assertEquals(0, Series.factorial(Integer.MAX_VALUE));
    }

    @Test
    void fibonacci() {
        Assertions.assertEquals(-1, Series.fibonacci(-1));
        Assertions.assertEquals(-1, Series.fibonacci(-2));
        Assertions.assertEquals(-1, Series.fibonacci(-10));

        Assertions.assertEquals(0, Series.fibonacci(0));
        Assertions.assertEquals(1, Series.fibonacci(1));
        Assertions.assertEquals(1, Series.fibonacci(2));
        Assertions.assertEquals(2, Series.fibonacci(3));
        Assertions.assertEquals(3, Series.fibonacci(4));
        Assertions.assertEquals(5, Series.fibonacci(5));
        Assertions.assertEquals(8, Series.fibonacci(6));
        Assertions.assertEquals(13, Series.fibonacci(7));
        Assertions.assertEquals(21, Series.fibonacci(8));
        Assertions.assertEquals(34, Series.fibonacci(9));
        Assertions.assertEquals(55, Series.fibonacci(10));
        Assertions.assertEquals(610, Series.fibonacci(15));
        // Assertions.assertEquals(0, Series.fibonacci(Integer.MAX_VALUE));
    }
}