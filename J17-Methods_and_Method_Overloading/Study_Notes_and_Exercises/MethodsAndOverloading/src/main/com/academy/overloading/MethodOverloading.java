package com.academy.overloading;

/*
 * Method Overloading occurs when a class has multiple 'methods',
 * each declared with the same Name, but 'different set of Parameters'.
 * (different method signatures)
 *
 * Method 'return type', 'access modifier' and 'parameter names', are not part of
 * the 'Method Signature'.
 *
 * Based on the Data Type of the Arguments that are passed to the method during the runtime,
 * Java can resolve, which 'overloaded method' it needs to execute.
 */
public class MethodOverloading {

    public static void main(String args[]) {
    }

    // ** Correct Overloaded Methods. **
    public static void doSomething(int paramA) { /* method body */ }

    public static void doSomething(float paramA) { /* method body */ }

    public static void doSomething(int paramA, float paramB) { /* method body */ }

    public static void doSomething(float paramB, int paramA) { /* method body */ }

    public static void doSomething(int paramA, int paramB, float paramC) { /* method body */ }

    // ** Errors when overloading methods. **
    /*
        public static void doSomething(double paramA) {
        }

        public static void doSomething(double paramB) {
            // Invalid. Just changing the 'parameter name'.
        }

        public static double doSomething(double paramB) {
            return 1d;
            // Invalid. Just changing 'Return Type'.
        }
    */
}
