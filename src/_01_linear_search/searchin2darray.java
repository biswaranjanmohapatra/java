package _01_linear_search;

import java.util.Arrays;

public class searchin2darray {
    public static void main(String[] args) {
        int[][] arr = {
                {11, 3, 4, 45, 66, 77, 6},
                {1, 434, 43, 4344, 442, 55},
                {12, 455, 566, 43}
        };

        int target = 12;

        int[] ans = search(arr, target);
        System.out.println("Target found at: " + Arrays.toString(ans));

        int max = maxval(arr);
        System.out.println("Maximum value: " + max);
    }

    // 🔍 Search in 2D Array
    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // 🔝 Find maximum value in 2D array
    static int maxval(int[][] arr) {
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}

