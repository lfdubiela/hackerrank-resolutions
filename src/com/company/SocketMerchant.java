package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SocketMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> colors = new HashMap<Integer, Integer>();
        int pairs = 0;

        for (int it : ar) {
            if (colors.containsKey(it)) {
                Integer counter = colors.get(it);
                counter++;
                colors.put(it, counter);
            } else {
                colors.put(it, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry: colors.entrySet()) {
            Integer numSocksOfColor = entry.getValue();
            int numPairOfCurrentColor = 0;

            if (numSocksOfColor % 2 != 0) {
                numPairOfCurrentColor = (numSocksOfColor -1)/2;
            } else {
                numPairOfCurrentColor = numSocksOfColor / 2;
            }

            pairs += numPairOfCurrentColor;
        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20};

        System.out.println(sockMerchant(9, arr));
    }
}
