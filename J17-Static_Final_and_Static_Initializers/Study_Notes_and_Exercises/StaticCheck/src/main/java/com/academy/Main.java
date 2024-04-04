package com.academy;

import com.academy._static.StaticTest;

public class Main {

    public final int multiplier = 4;

    public static void main(String[] args) {

        StaticTest firstObj = new StaticTest("1st Instance");
        System.out.println(firstObj.getInstanceName() + "'s Instance Counter = " + firstObj.getInstanceCounter());
        System.out.println(firstObj.getInstanceName() + "'s Static Counter = " + StaticTest.getStaticInsCounter());

        // VALID. It is also valid to access Static methods using the instance reference.
        /* System.out.println(firstObj.getInstanceName() + "'s Static Counter = "
                + firstObj.getStaticInsCounter()); */

        StaticTest secondObj = new StaticTest("2nd Instance");
        System.out.println(secondObj.getInstanceName() + "'s Instance Counter = " + secondObj.getInstanceCounter());
        System.out.println(secondObj.getInstanceName() + "'s Static Counter = " + StaticTest.getStaticInsCounter());

        StaticTest thirdObj = new StaticTest("3rd Instance");
        System.out.println(thirdObj.getInstanceName() + "'s Instance Counter = " + thirdObj.getInstanceCounter());  // Ans = 1
        System.out.println(thirdObj.getInstanceName() + "'s Static Counter = " + StaticTest.getStaticInsCounter()); // Ans = 3

        StaticTest.multiplyInstanceCount();


        // INVALID. It is invalid to reference Non-Static members from a Static method.
        // "multiply()" is an Instance method.
        /* int answer = multiply(7); */
    }

    public int multiply(int number) {
        return number * this.multiplier;
    }
}
