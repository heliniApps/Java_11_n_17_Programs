package com.academy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TestNumberInWord {

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
    void printNumberInWord() {
        NumberInWord.printNumberInWord(0);
        Assertions.assertEquals("ZERO", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWord(3);
        Assertions.assertEquals("THREE", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWord(7);
        Assertions.assertEquals("SEVEN", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWord(9);
        Assertions.assertEquals("NINE", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWord(10);
        Assertions.assertEquals("OTHER", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWord(-1);
        Assertions.assertEquals("OTHER", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();
    }


    @Test
    void printNumberInWordV5() {
        NumberInWord.printNumberInWordV5(0);
        Assertions.assertEquals("ZERO", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV5(3);
        Assertions.assertEquals("THREE", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV5(7);
        Assertions.assertEquals("SEVEN", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV5(9);
        Assertions.assertEquals("NINE", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV5(10);
        Assertions.assertEquals("OTHER", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV5(-1);
        Assertions.assertEquals("OTHER", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();
    }

    @Test
    void printNumberInWordV4() {
        NumberInWord.printNumberInWordV4(0);
        Assertions.assertEquals("ZERO", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV4(3);
        Assertions.assertEquals("THREE", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV4(7);
        Assertions.assertEquals("SEVEN", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV4(9);
        Assertions.assertEquals("NINE", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV4(10);
        Assertions.assertEquals("OTHER", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV4(-1);
        Assertions.assertEquals("OTHER", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();
    }

    @Test
    void printNumberInWordV3() {
        NumberInWord.printNumberInWordV3(0);
        Assertions.assertEquals("ZERO", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV3(3);
        Assertions.assertEquals("THREE", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV3(7);
        Assertions.assertEquals("SEVEN", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV3(9);
        Assertions.assertEquals("NINE", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV3(10);
        Assertions.assertEquals("OTHER", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV3(-1);
        Assertions.assertEquals("OTHER", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();
    }

    @Test
    void printNumberInWordV1() {
        NumberInWord.printNumberInWordV1(0);
        Assertions.assertEquals("ZERO", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV1(3);
        Assertions.assertEquals("THREE", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV1(7);
        Assertions.assertEquals("SEVEN", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV1(9);
        Assertions.assertEquals("NINE", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV1(10);
        Assertions.assertEquals("OTHER", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        NumberInWord.printNumberInWordV1(-1);
        Assertions.assertEquals("OTHER", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();
    }
}