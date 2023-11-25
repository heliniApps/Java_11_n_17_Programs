package academy.learnprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualityPrinterTest {

    @Test
    void isEqual() {
        Assertions.assertTrue(EqualityPrinter.isEqual(1, 1));
        Assertions.assertFalse(EqualityPrinter.isEqual(1, 3));
    }

    @Test
    void printEqual() {
        EqualityPrinter.printEqual(1, 1, 1);
        EqualityPrinter.printEqual(1, 1, 2);
        EqualityPrinter.printEqual(1, 2, 1);
        EqualityPrinter.printEqual(-1, -1, -1);
        EqualityPrinter.printEqual(1, 2, 3);
    }

    @Test
    void printEqualVersion2() {
        EqualityPrinter.printEqualVersion2(1, 1, 1);
        EqualityPrinter.printEqualVersion2(1, 1, 2);
        EqualityPrinter.printEqualVersion2(1, 2, 1);
        EqualityPrinter.printEqualVersion2(-1, -1, -1);
        EqualityPrinter.printEqualVersion2(1, 2, 3);
    }

}
