package com.academy;

import org.junit.jupiter.api.Test;

class SortedArrayTest {

    @Test
    void printArray() {

        SortedArray sortedArray = new SortedArray();
        int[] numberArray = { 4, 5 , 2, 10, 34, 3};
        sortedArray.printArray(numberArray);
    }

    @Test
    void sortDescending() {

        SortedArray sortedArray = new SortedArray();
        int[] numberArray = { 4, 5 , 2, 10, 34, 3};
        sortedArray.printArray(sortedArray.sortDescending(numberArray));
    }

    @Test
    void manualSortDescending() {

        SortedArray sortedArray = new SortedArray();
        int[] numberArray = { 4, 5 , 2, 10, 34, 3};
        sortedArray.printArray(sortedArray.manualSortDescending(numberArray));
    }
}