package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        List<Integer> result = new ArrayList<>();

        for (int i = d; i < (a.length + d); i++) {
            result.add(a[i % a.length]);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotLeft(new int[]{1, 2, 3, 4, 5}, 54)));
        System.out.println("");
    }
}
