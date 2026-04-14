package org.adler.arrays;

// Time: O(n), Space: O(1) // Approach: Two pointers in-place
public class P27RemoveElement {
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
