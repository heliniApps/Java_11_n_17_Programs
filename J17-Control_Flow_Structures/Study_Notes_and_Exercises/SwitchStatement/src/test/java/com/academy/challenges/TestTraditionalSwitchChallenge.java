package com.academy.challenges;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestTraditionalSwitchChallenge {

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
    void printNatoPhoneticPhrase() {
        // valid
        TraditionalSwitchChallenge.printNatoPhoneticPhrase('A');
        Assertions.assertEquals("A = Able", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        TraditionalSwitchChallenge.printNatoPhoneticPhrase('B');
        Assertions.assertEquals("B = Baker", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        TraditionalSwitchChallenge.printNatoPhoneticPhrase('C');
        Assertions.assertEquals("C = Charlie", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        TraditionalSwitchChallenge.printNatoPhoneticPhrase('D');
        Assertions.assertEquals("D = Dog", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        TraditionalSwitchChallenge.printNatoPhoneticPhrase('E');
        Assertions.assertEquals("E = Easy", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        TraditionalSwitchChallenge.printNatoPhoneticPhrase('a');
        Assertions.assertEquals("a = Able", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        TraditionalSwitchChallenge.printNatoPhoneticPhrase('b');
        Assertions.assertEquals("b = Baker", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        TraditionalSwitchChallenge.printNatoPhoneticPhrase('c');
        Assertions.assertEquals("c = Charlie", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        TraditionalSwitchChallenge.printNatoPhoneticPhrase('d');
        Assertions.assertEquals("d = Dog", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        TraditionalSwitchChallenge.printNatoPhoneticPhrase('e');
        Assertions.assertEquals("e = Easy", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        // invalid
        TraditionalSwitchChallenge.printNatoPhoneticPhrase('f');
        Assertions.assertEquals("Letter 'f' was not found in the switch.", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        TraditionalSwitchChallenge.printNatoPhoneticPhrase('H');
        Assertions.assertEquals("Letter 'H' was not found in the switch.", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();
    }

    @Test
    void getNatoPhoneticPhrase() {
        Assertions.assertEquals("Able", TraditionalSwitchChallenge.getNatoPhoneticPhrase('A'));
        Assertions.assertEquals("Able", TraditionalSwitchChallenge.getNatoPhoneticPhrase('a'));
        Assertions.assertEquals("Baker", TraditionalSwitchChallenge.getNatoPhoneticPhrase('B'));
        Assertions.assertEquals("Baker", TraditionalSwitchChallenge.getNatoPhoneticPhrase('b'));
        Assertions.assertEquals("Charlie", TraditionalSwitchChallenge.getNatoPhoneticPhrase('C'));
        Assertions.assertEquals("Charlie", TraditionalSwitchChallenge.getNatoPhoneticPhrase('c'));
        Assertions.assertEquals("Dog", TraditionalSwitchChallenge.getNatoPhoneticPhrase('D'));
        Assertions.assertEquals("Dog", TraditionalSwitchChallenge.getNatoPhoneticPhrase('d'));
        Assertions.assertEquals("Easy", TraditionalSwitchChallenge.getNatoPhoneticPhrase('E'));
        Assertions.assertEquals("Easy", TraditionalSwitchChallenge.getNatoPhoneticPhrase('e'));
        Assertions.assertEquals("", TraditionalSwitchChallenge.getNatoPhoneticPhrase('F'));
        Assertions.assertEquals("", TraditionalSwitchChallenge.getNatoPhoneticPhrase('f'));
    }
}
