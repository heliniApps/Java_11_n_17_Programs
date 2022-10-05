package academy.learnprogramming;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        if (!isValidArg(first) || !isValidArg(second)){
            return -1;
        }

        int smallestNum = Math.min(first, second);
        int largestCommonDivisor = 0;

        for (int i=1; i <= smallestNum; i++) {
            if (((first % i) == 0) && ((second % i) == 0)) {
                largestCommonDivisor = i;
            }
        }

        return largestCommonDivisor;
    }

    static boolean isValidArg(int number) {
        return (number >= 10);
    }
}
