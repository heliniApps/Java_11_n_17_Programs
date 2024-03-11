package com.academy;

public class MegaBytesConverter {

    /**
     * Convert and print the number of MegaBytes and remaining KiloBytes,
     * from a given number of KiloBytes.
     *
     * @param kiloBytes number of KiloBytes to be converted.
     */
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int megaBytes = (kiloBytes / 1024);
        int kiloBytesRemainder = (kiloBytes % 1024);
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesRemainder + " KB");
    }

    /* Version 1 */
    public static void printMegaBytesAndKiloBytesV1(int kiloBytes) {
        String conversionText = (kiloBytes >= 0) ?
                String.format("%1$d KB = %2$d MB and %3$d KB", kiloBytes, (kiloBytes / 1024), (kiloBytes % 1024)) :
                "Invalid Value";
        System.out.println(conversionText);
    }
}
