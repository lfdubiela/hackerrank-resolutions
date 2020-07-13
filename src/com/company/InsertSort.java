package com.company;

import java.util.Arrays;

public class InsertSort {

    static void insertionSort1(int n, int[] arr) {
        int removedValue = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            int currentValue = arr[i];
            if (removedValue == 0 && currentValue < arr[i - 1]) {
                removedValue = arr[i];
                arr[i] = arr[i - 1];
                i--;
                sout(arr);
            } else if (currentValue > removedValue) {
                arr[i + 1] = arr[i];
                sout(arr);
            } else if (currentValue < removedValue) {
                arr[i] = removedValue;
                sout(arr);
                break;
            }

//            if (i == 0 && currentValue > removedValue) {
//                arr[0] = removedValue;
//                sout(arr);
//            }
        }
    }

    public static void sout(int[] arr) {
        System.out.println(Arrays.toString(arr).replace(",", "").replace("[", "").replace("]", ""));

    }

    public static void main(String[] args) {
        insertionSort1(5, new int[] {2, 4, 6, 8, 3});
        insertionSort1(14, new int[] {1, 3, 5, 9, 13, 22, 27, 35, 46, 51, 55, 83, 87, 23});
        insertionSort1(10, new int[] {2,3,4,5,6,7,8,9,10, 1});
    }
}
