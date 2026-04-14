package org.adler.arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class P27RemoveElementTest {

    @Test
    void testRemoveThrees() {
        int[] nums = {3, 2, 2, 3};
        int k = P27RemoveElement.removeElement(nums, 3);
        assertEquals(2, k);
        int[] result = Arrays.copyOf(nums, k);
        Arrays.sort(result);
        assertArrayEquals(new int[]{2, 2}, result);
    }

    @Test
    void testRemoveTwos() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int k = P27RemoveElement.removeElement(nums, 2);
        assertEquals(5, k);
        int[] result = Arrays.copyOf(nums, k);
        Arrays.sort(result);
        assertArrayEquals(new int[]{0, 0, 1, 3, 4}, result);
    }

    @Test
    void testValueNotPresent() {
        int[] nums = {1, 2, 3};
        assertEquals(3, P27RemoveElement.removeElement(nums, 5));
    }

    @Test
    void testAllSameValue() {
        int[] nums = {4, 4, 4};
        assertEquals(0, P27RemoveElement.removeElement(nums, 4));
    }
}
