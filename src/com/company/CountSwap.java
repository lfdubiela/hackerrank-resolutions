package com.company;

public class CountSwap {

    // Complete the repeatedString function below.
    static void countSwaps(int[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int currentVal = arr[j];
                    int nextVal = arr[j + 1];

                    arr[j + 1] = currentVal;
                    arr[j] = nextVal;

                    counter++;
                }
            }
        }

        System.out.printf(
                "Array is sorted in %d swaps. \n" +
                "First Element: %d \n" +
                "Last Element: %d",
                counter, arr[0], arr[arr.length - 1]
        );
    }

    public static void main(String[] args) {
        countSwaps(new int[] {1, 4 ,3, 2});
    }
}
