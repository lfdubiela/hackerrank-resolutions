package com.company;

public class JumpingClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int lastIndexJumpable = c.length - 1;

        for (int i = 0; i < lastIndexJumpable; i++) {
            boolean canJumpTwo = i + 2 < c.length;

            if (canJumpTwo && c[i + 2] == 0) {
                i++;
            }

            jumps++;
        }

        return jumps;
    }

    public static void main(String[] args) {
        System.out.printf("%d expected to be 3", jumpingOnClouds(new int[] {0, 0, 0, 0, 1, 0}));
        System.out.println("");
        System.out.printf("%d expected to be 3", jumpingOnClouds(new int[] {0, 0, 0, 1, 0, 0}));
    }
}
