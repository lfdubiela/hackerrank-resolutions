package com.company;

public class EnglishLetters {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long div = n / s.length();

        long rest = n - (div * s.length());

        String leftLetters = s.substring(0, (int) rest);

        long countLeft = Long.parseLong(String.valueOf(leftLetters.length() - leftLetters.replaceAll("a", "").length()));

        long count = Long.parseLong(String.valueOf(s.length() - s.replaceAll("a", "").length()));

        return (count * div) + countLeft;
    }

    public static void main(String[] args) {
        System.out.printf("%d expected to be 7", repeatedString("aba", 10));
        System.out.println("");
        System.out.printf("%d expected to be 4", repeatedString("abcac", 10));
    }
}
