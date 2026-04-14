package org.adler.arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class P4MedianofTwoSortedArraysTest {

    @Test
    void testOddTotalLength() {
        assertEquals(2.0, P4MedianofTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    @Test
    void testEvenTotalLength() {
        assertEquals(2.5, P4MedianofTwoSortedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    @Test
    void testOneEmptyArray() {
        assertEquals(2.0, P4MedianofTwoSortedArrays.findMedianSortedArrays(new int[]{}, new int[]{2}));
    }

    @Test
    void testSingleElementArrays() {
        assertEquals(1.5, P4MedianofTwoSortedArrays.findMedianSortedArrays(new int[]{1}, new int[]{2}));
    }
}
