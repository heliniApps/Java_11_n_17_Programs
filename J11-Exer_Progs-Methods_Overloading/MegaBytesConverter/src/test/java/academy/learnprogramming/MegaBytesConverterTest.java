package academy.learnprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MegaBytesConverterTest {

    @Test
    public void printMegaBytesAndKiloBytes() {

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        MegaBytesConverter.printMegaBytesAndKiloBytes(0);

    }

    @Test
    public void calcMegaBytesFromKiloBytes() {

        int kiloBytes = 2500;
        int megaBytes = MegaBytesConverter.calcMegaBytesFromKiloBytes(kiloBytes);

        Assertions.assertEquals(2, megaBytes);
    }

    @Test
    public void calcKiloBytesRemainder() {

        int kiloBytes = 2500;
        int remainder = MegaBytesConverter.calcKiloBytesRemainder(kiloBytes);

        Assertions.assertEquals(452, remainder);
    }
}
