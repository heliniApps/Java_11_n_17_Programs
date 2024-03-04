package main.java.challenges;

public class DataTypesChallenge {

    public static void main(String args[]) {

        wholeNumbersChallenge1();
        realNumbersChallenge2();
        charValuesChallenge3();
    }

    public static void wholeNumbersChallenge1() {
        byte byteNumber = 100;
        short shortNumber = 32000;
        int integerVal = 33000;

        // long
        long longTotal = 50_000L + ((byteNumber + shortNumber + integerVal) * 10L);

        System.out.printf("Long Total : %d %n", longTotal);

        // short
        byteNumber = 50;
        shortNumber = 200;
        integerVal = 500;
        short shortTotal = (short) (1000 + ((byteNumber + shortNumber + integerVal) * 10));
        System.out.printf("Short Total : %d %n%n", shortTotal);
    }

    public static void realNumbersChallenge2() {
        double numberOfPounds = 5d;
        double conversionRate = 0.45359237d;
        double numOfKilograms = numberOfPounds * conversionRate;

        System.out.printf("%nNumber of Kilograms : %1$.7f %n", numOfKilograms);
    }

    public static void charValuesChallenge3() {
        char charLiteral = '?';
        char charAsUnicodeVal = '\u003F';
        char charAsNumericVal = 63;

        System.out.println("\nChar literal for '?' : " + charLiteral);
        System.out.println("Unicode representation : " + charAsUnicodeVal);
        System.out.println("Integer value : " + charAsNumericVal);
    }
}
