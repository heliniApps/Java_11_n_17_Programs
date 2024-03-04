package main.java;

public class Main {

    public static void main(String args[]) {

        System.out.println("Hello World!!");
        System.out.println("Hello, Tim...");

        int myIntValue = 5;
        System.out.println("Int value: " + myIntValue);

        myIntValue = 1000;
        System.out.println("Changed Int: " + myIntValue);

        myIntValue = 10 + 5;
        System.out.println("Multi literal expressions: " + myIntValue);

        myIntValue = myIntValue + (10 * 2);
        System.out.println("Evaluating expr: " + myIntValue);

        // Challenge1
        int mySecondInt = 12;
        int myThirdInt = 6;

        int myTotal = myIntValue + mySecondInt + myThirdInt;
        System.out.println("Total: " + myTotal);

        myThirdInt = myIntValue * 2;

        myTotal = myIntValue + mySecondInt + myThirdInt;
        System.out.println("New Total: " + myTotal);

        int myLastInt = 1000 - myTotal;
        System.out.println("Last Int: " + myLastInt);
    }
}