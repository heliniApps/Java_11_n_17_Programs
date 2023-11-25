package academy.learnprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCalculatorTest {

    @Test
    void isLeapYear(){

        Assertions.assertTrue(LeapYearCalculator.isLeapYear(2000));
        Assertions.assertTrue(LeapYearCalculator.isLeapYear(1600));
        Assertions.assertTrue(LeapYearCalculator.isLeapYear(2400));
        Assertions.assertTrue(LeapYearCalculator.isLeapYear(2004));

        Assertions.assertFalse(LeapYearCalculator.isLeapYear(1700));
        Assertions.assertFalse(LeapYearCalculator.isLeapYear(1800));
        Assertions.assertFalse(LeapYearCalculator.isLeapYear(1900));
        Assertions.assertFalse(LeapYearCalculator.isLeapYear(2100));
        Assertions.assertFalse(LeapYearCalculator.isLeapYear(2200));
        Assertions.assertFalse(LeapYearCalculator.isLeapYear(2300));
        Assertions.assertFalse(LeapYearCalculator.isLeapYear(2500));
        Assertions.assertFalse(LeapYearCalculator.isLeapYear(2600));
        Assertions.assertFalse(LeapYearCalculator.isLeapYear(-24));
        Assertions.assertFalse(LeapYearCalculator.isLeapYear(1997));
    }

    @Test
    void isValidYear() {
        Assertions.assertTrue(LeapYearCalculator.isValidYear(2000));
        Assertions.assertTrue(LeapYearCalculator.isValidYear(1));
        Assertions.assertTrue(LeapYearCalculator.isValidYear(9999));

        Assertions.assertFalse(LeapYearCalculator.isValidYear(0));
        Assertions.assertFalse(LeapYearCalculator.isValidYear(-1));
        Assertions.assertFalse(LeapYearCalculator.isValidYear(10000));
    }

}
