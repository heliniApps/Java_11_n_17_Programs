package main.java.operatorsAndExpressions;

public class OperatorsOperandsAndExpressions {

    public static void main(String args[]) {

        usingDifferentOperators();
        abbreviatingOperators();
        postfixIncrementAndDecrement();
    }

    public static void usingDifferentOperators() {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);    // Output: 3

        int previousResult = result;
        result = result - 1;

        System.out.println("result - 1 = " + result);    // Output: 2
        System.out.println("previousResult: " + previousResult);    // Output: 3

        result = result * 10;
        System.out.println("result * 10 = " + result);    // Output: 20

        result = result / 4;
        System.out.println("result / 4 = " + result);    // Output: 5

        result = result % 3;
        System.out.println("result % 3 = " + result);    // Output: 2
    }

    public static void abbreviatingOperators() {
        System.out.println("\nAbbreviated Operators.");

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);    // Output: 3

        result -= 1;
        System.out.println("result - 1 = " + result);    // Output: 2

        result *= 10;
        System.out.println("result * 10 = " + result);    // Output: 20

        result /= 4;
        System.out.println("result / 4 = " + result);    // Output: 5

        result %= 3;
        System.out.println("result % 3 = " + result);    // Output: 2
    }

    public static void postfixIncrementAndDecrement() {
        System.out.println("\nPost-fix & Pre-fix, Increment and Decrement.");

        int result = 5 * 4;
        System.out.println("result = " + result);

        System.out.println("Post-fix Increment:  result++ = " + result++);  // Output: 20
        System.out.println("After Post-fix Increment:  result = " + result);    // Output: 21

        System.out.println("\nPrefix Increment: ++result = " + (++result));   // Output: 22
        System.out.println("After Prefix Increment: result = " + result);   // Output: 22

        result++;
        System.out.println("\nAfter Post-fix Increment [as a standalone statement]: result = " +
                result);    // Output: 23
    }
}
