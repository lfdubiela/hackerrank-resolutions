package com.company;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RansomNote {

    // Complete the repeatedString function below.
    static String checkMagazine(String[] magazine, String[] notes) {
        Map<String, Long> words = Arrays.stream(magazine)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Boolean result = true;

        for (String word : notes) {
            if (words.containsKey(word) && words.get(word) > 0) {
                Long count = words.get(word);
                words.put(word, --count);
            } else {
                return "No";
            }
        }

        return "Yes";
    }

    public static void main(String[] args) {
        System.out.println(checkMagazine(
                new String[]{"give", "me", "one", "grand", "today", "night"},
                new String[]{"give", "one", "grand", "today"}
        ));

        System.out.println(checkMagazine(
                new String[]{"two", "times", "three", "is", "not", "four"},
                new String[]{"two", "times", "two", "is", "four"}
        ));
    }
}
