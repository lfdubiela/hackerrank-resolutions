package com.company;

public class HourGlass {

    // Complete the repeatedString function below.
    static int hourglassSum(int[][] arr) {
        Integer maxGlassHour = null;

        for (int line = 0; line < 4; line++) {
            for (int col = 0; col < 4; col++) {
                int countHour = arr[line][col] + arr[line][col + 1] + arr[line][col + 2]
                        + arr[line + 1][col + 1]
                        + arr[line + 2][col] + arr[line + 2][col + 1] + arr[line + 2][col + 2];

                if (maxGlassHour == null || maxGlassHour < countHour) maxGlassHour = countHour;
            }
        }

        return maxGlassHour;
    }

    public static void main(String[] args) {
        System.out.println(hourglassSum(new int[][]{
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0},
        }));

        System.out.println(hourglassSum(new int[][]{
                {-1, -1,  0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5},
        }));
    }
}
