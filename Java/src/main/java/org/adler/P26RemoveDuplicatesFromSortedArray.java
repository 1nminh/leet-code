package org.adler;

public class P26RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println("Problem 26");
        int[] nums = new int[]{1, 1, 1, 2, 2, 3, 3, 3};
        removeDuplicates(nums);
        for (int num : nums) {
            System.out.print(num);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
