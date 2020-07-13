package com.company;

public class Anagram {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        for (char c: a.toCharArray()) {
            if (b.indexOf(c) > - 1) {
                a = a.replaceFirst("" + c, "");
                b = b.replaceFirst("" + c, "");
            }
        }

        return a.length() + b.length();
    }


    public static void main(String[] args) {
        System.out.printf("%d expected to be 4", makeAnagram("cde", "abc"));
    }
}
