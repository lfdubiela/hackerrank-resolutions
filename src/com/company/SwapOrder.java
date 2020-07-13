package com.company;

import java.util.Arrays;
import java.util.List;

public class SwapOrder {

    // Complete the repeatedString function below.
    static int minimumSwaps(int[] arr) {
        int countSwap = 0;
        Boolean[] visited = new Boolean[arr.length];
        Arrays.fill(visited, false);

        List<Boolean> list = Arrays.asList(visited);

        while (list.contains(false)) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == i + 1) {
                    visited[i] = true;
                }

                if (arr[i] != i + 1) {
                    int currentVal = arr[i];
                    int valOfCurrentVal = arr[currentVal - 1];

                    arr[i] = valOfCurrentVal;
                    arr[currentVal - 1] = currentVal;

                    visited[currentVal - 1] = true;
                    countSwap++;
                }
            }
        }

        return countSwap;
    }

    public static void main(String[] args) {
        System.out.printf("%d expected to be 1", minimumSwaps(new int[] {1, 4 ,3, 2}));
//        System.out.println("");
        System.out.printf("%d expected to be 3", minimumSwaps(new int[]{4, 3, 1, 2}));
        System.out.println("");
        System.out.printf("%d expected to be 3", minimumSwaps(new int[]{2, 3, 4, 1, 5}));
//        System.out.println("");
        System.out.printf("%d expected to be 3", minimumSwaps(new int[] {1, 3, 5, 2, 4, 6, 7}));
    }
}
