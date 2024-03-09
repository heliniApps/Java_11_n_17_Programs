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
        int kiloBytesInMb = 1024;
        int megaBytes = kiloBytes / kiloBytesInMb;
        int kiloBytesRemainder = kiloBytes % kiloBytesInMb;
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesRemainder + " KB");
    }
}
