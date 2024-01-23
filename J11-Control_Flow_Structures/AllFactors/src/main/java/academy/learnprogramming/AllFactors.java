package academy.learnprogramming;

public class AllFactors {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printFactors(int number) {

        if(number < 1) {
            System.out.println(INVALID_VALUE_MESSAGE);
        }

        for (int i=1; i <= number; i++) {
            if ((number % i) == 0) {
                System.out.println(i);
            }
        }

        // Option 2:
        /*int count = 1;
        while (count <= number) {
            if ((number % count) == 0) {
                System.out.println(count);
            }
            count++;
        }*/
    }
}
