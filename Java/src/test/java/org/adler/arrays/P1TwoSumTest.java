package org.adler.arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class P1TwoSumTest {

    @Test
    void testBasicCase() {
        assertArrayEquals(new int[]{0, 1}, P1TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void testNonAdjacentIndices() {
        assertArrayEquals(new int[]{1, 2}, P1TwoSum.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    void testDuplicateElements() {
        assertArrayEquals(new int[]{0, 1}, P1TwoSum.twoSum(new int[]{3, 3}, 6));
    }

    @Test
    void testNegativeNumbers() {
        assertArrayEquals(new int[]{0, 2}, P1TwoSum.twoSum(new int[]{-1, 0, 1}, 0));
    }
}
