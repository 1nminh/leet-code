package org.adler;

public class P35SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println("Problem 35");
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        System.out.println("Insert position: " + searchInsert(nums, target));

        target = 2;
        System.out.println("Insert position: " + searchInsert(nums, target));

        target = 7;
        System.out.println("Insert position: " + searchInsert(nums, target));

        target = 0;
        System.out.println("Insert position: " + searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
}
