package com.academy;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = 0;
        if ((tonerLevel > 0) && (tonerLevel <= 100)) {
            this.tonerLevel = tonerLevel;
        }

        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int addToner(int tonerAmount) {
        if ((tonerAmount <= 0) || (tonerAmount > 100)) {
            return -1;
        }

        if ((getTonerLevel() + tonerAmount) > 100) {
            return -1;
        }
        this.tonerLevel += tonerAmount;

        return getTonerLevel();
    }

    public int printPages(int numOfSidesToPrint) {
        if (numOfSidesToPrint < 0) {
            return -1;
        }

        int pagesToPrint = numOfSidesToPrint;
        if (isDuplex()) {
            pagesToPrint = (numOfSidesToPrint / 2) + (numOfSidesToPrint % 2);
        }
        this.pagesPrinted += pagesToPrint;

        return pagesToPrint;
     }
}
