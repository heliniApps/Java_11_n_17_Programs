package com.academy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TestMegaBytesConverter {

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
    void printMegaBytesAndKiloBytes() {
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        MegaBytesConverter.printMegaBytesAndKiloBytes(-1);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        MegaBytesConverter.printMegaBytesAndKiloBytes(0);
        Assertions.assertEquals("0 KB = 0 MB and 0 KB", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        Assertions.assertEquals("2500 KB = 2 MB and 452 KB", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        Assertions.assertEquals("5000 KB = 4 MB and 904 KB", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();
    }

    // Testing 'Version 1'
    @Test
    void printMegaBytesAndKiloBytesV1() {
        MegaBytesConverter.printMegaBytesAndKiloBytesV1(-1024);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        MegaBytesConverter.printMegaBytesAndKiloBytesV1(-1);
        Assertions.assertEquals("Invalid Value", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        MegaBytesConverter.printMegaBytesAndKiloBytesV1(0);
        Assertions.assertEquals("0 KB = 0 MB and 0 KB", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        MegaBytesConverter.printMegaBytesAndKiloBytesV1(2500);
        Assertions.assertEquals("2500 KB = 2 MB and 452 KB", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();

        MegaBytesConverter.printMegaBytesAndKiloBytesV1(5000);
        Assertions.assertEquals("5000 KB = 4 MB and 904 KB", outStreamCaptor.toString().trim());
        outStreamCaptor.reset();
    }
}