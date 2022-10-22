package com.academy;

public class Main {

    public static void main(String[] args) {

        ReverseArray reverseArr = new ReverseArray();
        int count = reverseArr.readCount();

        if (count > 0) {
            int[] numberArray = reverseArr.readElements(count);
            // Option 1
            reverseArr.reverse_version1(numberArray);

            // Option 2
//            reverseArr.reverse_version2(numberArray);
        }

        reverseArr.closeInputSteam();
    }
}
