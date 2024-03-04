package main.java.challenges;

public class OperatorPrecedenceChallenge {

    public static void main(String args[]) {

        double firstDoubleVal = 20d;
        double secondDoubleVal = 80d;

        double total = (firstDoubleVal + secondDoubleVal) * 100d;
        double remainder = total % 40d;

        boolean isRemainderZero = (remainder == 0.00);
        /* boolean isRemainderZero = (remainder == 0.00) ? true : false; */

        System.out.println("Total = " + total);
        System.out.println("remainder = " + remainder);
        System.out.println("isRemainderZero = " + isRemainderZero);

        if (!isRemainderZero) {
            System.out.println("Got some remainder.");
        }
    }
}
