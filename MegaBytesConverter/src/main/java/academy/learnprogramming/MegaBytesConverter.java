package academy.learnprogramming;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = calcMegaBytesFromKiloBytes(kiloBytes);
            int remainder = calcKiloBytesRemainder(kiloBytes);

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }

    static int calcMegaBytesFromKiloBytes(int kiloBytes) {
        return (kiloBytes / 1024);
    }

    static int calcKiloBytesRemainder(int kiloBytes) {
        return (kiloBytes % 1024);
    }
}
