package com.academy.challenges;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TestMethodsChallenge {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void calculateHighScorePosition() {
        Assertions.assertEquals(1, MethodsChallenge.calculateHighScorePosition(1500));
        Assertions.assertEquals(1, MethodsChallenge.calculateHighScorePosition(1000));
        Assertions.assertEquals(2, MethodsChallenge.calculateHighScorePosition(999));

        Assertions.assertEquals(2, MethodsChallenge.calculateHighScorePosition(501));
        Assertions.assertEquals(2, MethodsChallenge.calculateHighScorePosition(500));
        Assertions.assertEquals(3, MethodsChallenge.calculateHighScorePosition(499));

        Assertions.assertEquals(3, MethodsChallenge.calculateHighScorePosition(101));
        Assertions.assertEquals(3, MethodsChallenge.calculateHighScorePosition(100));
        Assertions.assertEquals(4, MethodsChallenge.calculateHighScorePosition(99));

        Assertions.assertEquals(4, MethodsChallenge.calculateHighScorePosition(25));
        Assertions.assertEquals(4, MethodsChallenge.calculateHighScorePosition(0));
        Assertions.assertEquals(4, MethodsChallenge.calculateHighScorePosition(-100));
    }

    @Test
    void displayHighScorePosition() {
        MethodsChallenge.displayHighScorePosition("Tim", 2);
        Assertions.assertEquals(
                "Tim managed to get into position 2 on the high score list",
                outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
    }
}
