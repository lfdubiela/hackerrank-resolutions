package com.company;

import java.util.HashMap;
import java.util.Map;

public class GaryValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int level = 0;
        char lastStep = 'A';
        int valleys = 0;

        for (char step: s.toCharArray()) {
            if (step == 'U') ++level;
            if (step == 'D') --level;
            if (step == 'U' && level == 0) ++valleys;
        }

        return valleys;
    }


    public static void main(String[] args) {
        System.out.println(countingValleys(12, "DUDU"));
    }
}
