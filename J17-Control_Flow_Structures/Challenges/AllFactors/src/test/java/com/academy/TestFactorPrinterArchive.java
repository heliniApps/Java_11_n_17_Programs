package com.academy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class TestFactorPrinterArchive {

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
    void printFactorsV3() {
        FactorPrinterArchive.printFactorsV3(0);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        FactorPrinterArchive.printFactorsV3(-1);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        FactorPrinterArchive.printFactorsV3(-54);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        FactorPrinterArchive.printFactorsV3(6);
        Assertions.assertEquals("1 2 3 6", getFormattedOutputText(outStreamCaptor));
        outStreamCaptor.reset();

        FactorPrinterArchive.printFactorsV3(10);
        Assertions.assertEquals("1 2 5 10", getFormattedOutputText(outStreamCaptor));
        outStreamCaptor.reset();

        FactorPrinterArchive.printFactorsV3(27);
        Assertions.assertEquals("1 3 9 27", getFormattedOutputText(outStreamCaptor));
        outStreamCaptor.reset();

        FactorPrinterArchive.printFactorsV3(32);
        Assertions.assertEquals("1 2 4 8 16 32", getFormattedOutputText(outStreamCaptor));
        outStreamCaptor.reset();
    }

    @Test
    void printFactorsV2() {
        FactorPrinterArchive.printFactorsV2(0);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        FactorPrinterArchive.printFactorsV2(-1);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        FactorPrinterArchive.printFactorsV2(-54);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        FactorPrinterArchive.printFactorsV2(6);
        Assertions.assertEquals("1 2 3 6", getFormattedOutputText(outStreamCaptor));
        outStreamCaptor.reset();

        FactorPrinterArchive.printFactorsV2(10);
        Assertions.assertEquals("1 2 5 10", getFormattedOutputText(outStreamCaptor));
        outStreamCaptor.reset();

        FactorPrinterArchive.printFactorsV2(27);
        Assertions.assertEquals("1 3 9 27", getFormattedOutputText(outStreamCaptor));
        outStreamCaptor.reset();

        FactorPrinterArchive.printFactorsV2(32);
        Assertions.assertEquals("1 2 4 8 16 32", getFormattedOutputText(outStreamCaptor));
        outStreamCaptor.reset();
    }

    @Test
    void printFactorsV1() {
        FactorPrinterArchive.printFactorsV1(0);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        FactorPrinterArchive.printFactorsV1(-1);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        FactorPrinterArchive.printFactorsV1(-54);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        FactorPrinterArchive.printFactorsV1(6);
        Assertions.assertEquals("1 2 3 6", getFormattedOutputText(outStreamCaptor));
        outStreamCaptor.reset();

        FactorPrinterArchive.printFactorsV1(10);
        Assertions.assertEquals("1 2 5 10", getFormattedOutputText(outStreamCaptor));
        outStreamCaptor.reset();

        FactorPrinterArchive.printFactorsV1(27);
        Assertions.assertEquals("1 3 9 27", getFormattedOutputText(outStreamCaptor));
        outStreamCaptor.reset();

        FactorPrinterArchive.printFactorsV1(32);
        Assertions.assertEquals("1 2 4 8 16 32", getFormattedOutputText(outStreamCaptor));
        outStreamCaptor.reset();
    }
}