package com.academy;

public class Main {

    public static void main(String[] args) {

        MinimumElement minElem = new MinimumElement();
        int count = minElem.readCount();

        if (count > 0) {
            int[] numberArray = minElem.readElements(count);
            System.out.println("Minimum Number = " + minElem.findMinimum(numberArray));
        }

        minElem.closeInputStream();
    }
}
