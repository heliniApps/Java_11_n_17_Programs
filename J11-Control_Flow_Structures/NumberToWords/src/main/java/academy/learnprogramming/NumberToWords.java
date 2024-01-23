package academy.learnprogramming;

public class NumberToWords {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    private static final String ZERO_TEXT = "Zero";

    public static void printNumberToWords(int number) {

        if (number < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        }
        if (number == 0) {
            System.out.println(ZERO_TEXT);
        }

        int reversedNumber = reverse(number);
        int missingZerosCount = getDigitCount(number) - getDigitCount(reversedNumber);

        while ((reversedNumber > 0) || (missingZerosCount > 0)) {
            int lastDigit;

            if ((reversedNumber <= 0) && (missingZerosCount > 0)) {
                lastDigit = 0;
                missingZerosCount--;
            } else {
                lastDigit = reversedNumber % 10;
                reversedNumber /= 10;
            }

            switch (lastDigit) {
                case 0:
                    System.out.println(ZERO_TEXT);
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println(INVALID_VALUE_MESSAGE);
                    break;
            }
        }

    }

    public static int reverse(int number) {

        boolean isNegativeNumber = false;
        int reversedNumber = 0;

        if (number < 0) {
            isNegativeNumber = true;
            number *= -1;
        }

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }

        if (isNegativeNumber) {
            reversedNumber *= -1;
        }

        return reversedNumber;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        return (String.valueOf(number).trim().length());
    }
}
