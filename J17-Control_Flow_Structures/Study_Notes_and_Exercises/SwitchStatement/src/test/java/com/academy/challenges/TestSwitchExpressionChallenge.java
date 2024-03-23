package com.academy.challenges;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class TestSwitchExpressionChallenge {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void printDayOfWeek() {
        SwitchExpressionChallenge.printDayOfWeek(0);
        Assertions.assertEquals("0 = Sunday", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SwitchExpressionChallenge.printDayOfWeek(1);
        Assertions.assertEquals("1 = Monday", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SwitchExpressionChallenge.printDayOfWeek(2);
        Assertions.assertEquals("2 = Tuesday", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SwitchExpressionChallenge.printDayOfWeek(3);
        Assertions.assertEquals("3 = Wednesday", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SwitchExpressionChallenge.printDayOfWeek(4);
        Assertions.assertEquals("4 = Thursday", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SwitchExpressionChallenge.printDayOfWeek(5);
        Assertions.assertEquals("5 = Friday", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SwitchExpressionChallenge.printDayOfWeek(6);
        Assertions.assertEquals("6 = Saturday", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SwitchExpressionChallenge.printDayOfWeek(7);
        Assertions.assertEquals("7 = Invalid Day", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SwitchExpressionChallenge.printDayOfWeek(-1);
        Assertions.assertEquals("-1 = Invalid Day", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();
    }

    @Test
    void printWeekDayWithIfElse() {
        SwitchExpressionChallenge.printWeekDayWithIfElse(0);
        Assertions.assertEquals("0 = Sunday", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SwitchExpressionChallenge.printWeekDayWithIfElse(1);
        Assertions.assertEquals("1 = Monday", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SwitchExpressionChallenge.printWeekDayWithIfElse(2);
        Assertions.assertEquals("2 = Tuesday", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SwitchExpressionChallenge.printWeekDayWithIfElse(3);
        Assertions.assertEquals("3 = Wednesday", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SwitchExpressionChallenge.printWeekDayWithIfElse(4);
        Assertions.assertEquals("4 = Thursday", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SwitchExpressionChallenge.printWeekDayWithIfElse(5);
        Assertions.assertEquals("5 = Friday", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SwitchExpressionChallenge.printWeekDayWithIfElse(6);
        Assertions.assertEquals("6 = Saturday", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SwitchExpressionChallenge.printWeekDayWithIfElse(7);
        Assertions.assertEquals("7 = Invalid Day", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        SwitchExpressionChallenge.printWeekDayWithIfElse(-1);
        Assertions.assertEquals("-1 = Invalid Day", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();
    }
}