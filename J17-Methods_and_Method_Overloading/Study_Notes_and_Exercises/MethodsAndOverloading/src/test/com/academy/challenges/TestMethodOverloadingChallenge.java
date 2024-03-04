package com.academy.challenges;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestMethodOverloadingChallenge {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void convertToCentimetersFromInches() {
        Assertions.assertEquals(
                0.0, MethodOverloadingChallenge.convertToCentimeters(0));
        Assertions.assertEquals(
                2.54d, MethodOverloadingChallenge.convertToCentimeters(1));
        Assertions.assertEquals(
                114.30d, MethodOverloadingChallenge.convertToCentimeters(45));
        Assertions.assertEquals(
                259.08d, MethodOverloadingChallenge.convertToCentimeters(102));
        Assertions.assertEquals(
                0.0, MethodOverloadingChallenge.convertToCentimeters(-10));
    }

    @Test
    void convertToCentimetersFromFeet() {
        Assertions.assertEquals(
                0.0, MethodOverloadingChallenge.convertToCentimeters(0, 0));
        Assertions.assertEquals(
                30.48d, MethodOverloadingChallenge.convertToCentimeters(1, 0));
        Assertions.assertEquals(
                25.40d, MethodOverloadingChallenge.convertToCentimeters(0, 10));
        Assertions.assertEquals(
                256.54d, MethodOverloadingChallenge.convertToCentimeters(8, 5));
        Assertions.assertEquals(
                0.0, MethodOverloadingChallenge.convertToCentimeters(-1, 20));
        Assertions.assertEquals(
                0.0, MethodOverloadingChallenge.convertToCentimeters(5, -4));
        Assertions.assertEquals(
                0.0, MethodOverloadingChallenge.convertToCentimeters(-5, -4));
    }
}
