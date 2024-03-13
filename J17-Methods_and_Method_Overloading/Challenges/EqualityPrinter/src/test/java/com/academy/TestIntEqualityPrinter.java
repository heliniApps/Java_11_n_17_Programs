package com.academy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TestIntEqualityPrinter {

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
    void printEqual() {
        // Invalid
        IntEqualityPrinter.printEqual(1, 1, -1);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqual(1, -1, 1);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqual(-1, 1, 1);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqual(-1, -1, -1);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        // All equal
        IntEqualityPrinter.printEqual(0, 0, 0);
        Assertions.assertEquals("All numbers are equal", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqual(1, 1, 1);
        Assertions.assertEquals("All numbers are equal", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqual(10, 10, 10);
        Assertions.assertEquals("All numbers are equal", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqual(23, 23, 23);
        Assertions.assertEquals("All numbers are equal", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        // All different
        IntEqualityPrinter.printEqual(0, 10, 20);
        Assertions.assertEquals("All numbers are different", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqual(1, 2, 3);
        Assertions.assertEquals("All numbers are different", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqual(14, 98, 345);
        Assertions.assertEquals("All numbers are different", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        // Neither all are equal nor different
        IntEqualityPrinter.printEqual(14, 14, 345);
        Assertions.assertEquals("Neither all are equal or different", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqual(345, 98, 345);
        Assertions.assertEquals("Neither all are equal or different", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqual(14, 98, 98);
        Assertions.assertEquals("Neither all are equal or different", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();
    }

    @Test
    void printEqualV2() {
        // Invalid
        IntEqualityPrinter.printEqualV2(1, 1, -1);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV2(1, -1, 1);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV2(-1, 1, 1);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV2(-1, -1, -1);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        // All equal
        IntEqualityPrinter.printEqualV2(0, 0, 0);
        Assertions.assertEquals("All numbers are equal", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV2(1, 1, 1);
        Assertions.assertEquals("All numbers are equal", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV2(10, 10, 10);
        Assertions.assertEquals("All numbers are equal", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV2(23, 23, 23);
        Assertions.assertEquals("All numbers are equal", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        // All different
        IntEqualityPrinter.printEqualV2(0, 10, 20);
        Assertions.assertEquals("All numbers are different", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV2(1, 2, 3);
        Assertions.assertEquals("All numbers are different", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV2(14, 98, 345);
        Assertions.assertEquals("All numbers are different", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        // Neither all are equal nor different
        IntEqualityPrinter.printEqualV2(14, 14, 345);
        Assertions.assertEquals("Neither all are equal or different", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV2(345, 98, 345);
        Assertions.assertEquals("Neither all are equal or different", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV2(14, 98, 98);
        Assertions.assertEquals("Neither all are equal or different", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();
    }

    @Test
    void printEqualV1() {
        // Invalid
        IntEqualityPrinter.printEqualV1(1, 1, -1);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV1(1, -1, 1);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV1(-1, 1, 1);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV1(-1, -1, -1);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        // All equal
        IntEqualityPrinter.printEqualV1(0, 0, 0);
        Assertions.assertEquals("All numbers are equal", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV1(1, 1, 1);
        Assertions.assertEquals("All numbers are equal", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV1(10, 10, 10);
        Assertions.assertEquals("All numbers are equal", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV1(23, 23, 23);
        Assertions.assertEquals("All numbers are equal", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        // All different
        IntEqualityPrinter.printEqualV1(0, 10, 20);
        Assertions.assertEquals("All numbers are different", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV1(1, 2, 3);
        Assertions.assertEquals("All numbers are different", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV1(14, 98, 345);
        Assertions.assertEquals("All numbers are different", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        // Neither all are equal nor different
        IntEqualityPrinter.printEqualV1(14, 14, 345);
        Assertions.assertEquals("Neither all are equal or different", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV1(345, 98, 345);
        Assertions.assertEquals("Neither all are equal or different", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        IntEqualityPrinter.printEqualV1(14, 98, 98);
        Assertions.assertEquals("Neither all are equal or different", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();
    }
}