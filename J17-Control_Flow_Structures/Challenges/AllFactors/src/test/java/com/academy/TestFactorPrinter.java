package com.academy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TestFactorPrinter {

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

    /*
     * Convert the output stream value to a single line of text,
     * so that it can be tested in Assertion functions.
     */
    private String getFormattedOutputText(ByteArrayOutputStream outStream) {
        return outStream.toString().replaceAll("\n", " ").trim();
    }

    @Test
    void printFactors() {
        FactorPrinter.printFactors(0);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        FactorPrinter.printFactors(-1);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        FactorPrinter.printFactors(-54);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        FactorPrinter.printFactors(6);
        Assertions.assertEquals("1 2 3 6", getFormattedOutputText(outStreamCaptor));
        outStreamCaptor.reset();

        FactorPrinter.printFactors(10);
        Assertions.assertEquals("1 2 5 10", getFormattedOutputText(outStreamCaptor));
        outStreamCaptor.reset();

        FactorPrinter.printFactors(27);
        Assertions.assertEquals("1 3 9 27", getFormattedOutputText(outStreamCaptor));
        outStreamCaptor.reset();

        FactorPrinter.printFactors(32);
        Assertions.assertEquals("1 2 4 8 16 32", getFormattedOutputText(outStreamCaptor));
        outStreamCaptor.reset();
    }
}
