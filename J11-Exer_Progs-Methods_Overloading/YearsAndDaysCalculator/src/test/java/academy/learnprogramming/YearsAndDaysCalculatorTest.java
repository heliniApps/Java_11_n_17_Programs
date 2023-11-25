package academy.learnprogramming;

import org.junit.jupiter.api.Test;

public class YearsAndDaysCalculatorTest {

    @Test
    void printYearsAndDays() {
        YearsAndDaysCalculator.printYearsAndDays(680L, 2, 20);
        YearsAndDaysCalculator.printYearsAndDays(-680L, 2, 20);
    }

    @Test
    void printYearsAndDays2() {
        YearsAndDaysCalculator.printYearsAndDays(1892160L);
        YearsAndDaysCalculator.printYearsAndDays(1051200L);
        YearsAndDaysCalculator.printYearsAndDays(-5000L);
    }
}
