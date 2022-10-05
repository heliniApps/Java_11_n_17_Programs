package academy.learnprogramming;

import org.junit.jupiter.api.Test;

class AllFactorsTest {

    @Test
    void printFactors() {
        AllFactors.printFactors(6);
        System.out.println();
        AllFactors.printFactors(32);
        System.out.println();
        AllFactors.printFactors(10);
        System.out.println();
        AllFactors.printFactors(-1);
        System.out.println();
        AllFactors.printFactors(0);
    }
}