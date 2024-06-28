package org.adler;

import java.util.Arrays;

public class P1TwoSum {
    public static void main(String[] args) throws Exception {
        System.out.println("Problem 1");

        int[] arr = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));

        arr = new int[]{3, 2, 4};
        target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));

        arr = new int[]{{3, 3};
        target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

}
