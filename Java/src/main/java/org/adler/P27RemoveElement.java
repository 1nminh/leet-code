package org.adler;

public class P27RemoveElement {
    public static void main(String[] args) {
        System.out.println("Problem 27");
        int[] nums = new int[]{1, 1, 1, 2, 2, 3, 3, 3};
        int val = 2;
        int k = removeElement(nums, val);
        for (int num : nums) {
            System.out.print(num);
        }
        System.out.println("K: " + k);
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
