package org.adler;

import java.util.Arrays;

public class P4MedianofTwoSortedArrays {
    public static void main(String[] args) throws Exception {
        System.out.println("Problem 4");
        
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median of two sorted arrays: " + findMedianSortedArrays(nums1, nums2)); // Output: 2.0

        nums1 = new int[]{1, 2};
        nums2 = new int[]{3, 4};
        System.out.println("Median of two sorted arrays: " + findMedianSortedArrays(nums1, nums2)); // Output: 2.5
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
        int n = merged.length;
        if (n % 2 == 0) {
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        } else {
            return merged[n / 2];
        }
    }

}
