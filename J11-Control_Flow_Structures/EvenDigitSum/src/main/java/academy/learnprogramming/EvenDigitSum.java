package academy.learnprogramming;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int evenDigitSum = 0;

        do {
            int lastDigit = number % 10;
            number /= 10;

            if (lastDigit % 2 != 0) {
                continue;
            }
            evenDigitSum += lastDigit;

        } while (number > 0);

        return evenDigitSum;
    }
}
