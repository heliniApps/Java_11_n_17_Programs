package com.academy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TestPositiveNegativeZero {


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
    void checkNumber() {
        final String POSITIVE_TEXT = "positive";
        final String NEGATIVE_TEXT = "negative";
        final String ZERO_TEXT = "zero";

        PositiveNegativeZero.checkNumber(1);
        Assertions.assertEquals(POSITIVE_TEXT, outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        PositiveNegativeZero.checkNumber(0);
        Assertions.assertEquals(ZERO_TEXT, outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        PositiveNegativeZero.checkNumber(-1);
        Assertions.assertEquals(NEGATIVE_TEXT, outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        PositiveNegativeZero.checkNumber(10);
        Assertions.assertEquals(POSITIVE_TEXT, outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        PositiveNegativeZero.checkNumber(-50);
        Assertions.assertEquals(NEGATIVE_TEXT, outStreamCaptor.toString().trim());
        outStreamCaptor.reset();
    }
}