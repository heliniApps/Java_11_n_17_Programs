package com.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    void addToner() {

        Printer printer = new Printer(40, false);
        assertEquals(-1, printer.addToner(90));
        assertEquals(40, printer.getTonerLevel());

        assertEquals(-1, printer.addToner(-30));
        assertEquals(40, printer.getTonerLevel());

        assertEquals(100, printer.addToner(60));
        assertEquals(100, printer.getTonerLevel());

        assertEquals(-1, printer.addToner(0));
        assertEquals(100, printer.getTonerLevel());
    }

    @Test
    void pagesPrinted() {

        Printer printer = new Printer(40, true);
        assertEquals(0, printer.getPagesPrinted());

        assertEquals(5, printer.printPages(9));
        assertEquals(5, printer.getPagesPrinted());

        assertEquals(-1, printer.printPages(-9));
        assertEquals(5, printer.getPagesPrinted());

        assertEquals(2, printer.printPages(4));
        assertEquals(7, printer.getPagesPrinted());

        Printer printer2 = new Printer(40, false);
        assertEquals(0, printer2.getPagesPrinted());

        assertEquals(9, printer2.printPages(9));
        assertEquals(9, printer2.getPagesPrinted());

        assertEquals(4, printer2.printPages(4));
        assertEquals(13, printer2.getPagesPrinted());
    }
}