package org.adler.arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class P26RemoveDuplicatesFromSortedArrayTest {

    @Test
    void testSmallArray() {
        int[] nums = {1, 1, 2};
        int k = P26RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        assertEquals(2, k);
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
    }

    @Test
    void testLargerArray() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = P26RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        assertEquals(5, k);
        int[] expected = {0, 1, 2, 3, 4};
        for (int i = 0; i < k; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    void testSingleElement() {
        int[] nums = {1};
        assertEquals(1, P26RemoveDuplicatesFromSortedArray.removeDuplicates(nums));
    }

    @Test
    void testAllSame() {
        int[] nums = {5, 5, 5, 5};
        assertEquals(1, P26RemoveDuplicatesFromSortedArray.removeDuplicates(nums));
        assertEquals(5, nums[0]);
    }
}
