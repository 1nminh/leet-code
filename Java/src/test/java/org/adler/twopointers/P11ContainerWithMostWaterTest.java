package org.adler.twopointers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class P11ContainerWithMostWaterTest {

    @Test
    void testStandardCase() {
        assertEquals(49, P11ContainerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void testTwoElements() {
        assertEquals(1, P11ContainerWithMostWater.maxArea(new int[]{1, 1}));
    }

    @Test
    void testSymmetricEnds() {
        assertEquals(16, P11ContainerWithMostWater.maxArea(new int[]{4, 3, 2, 1, 4}));
    }

    @Test
    void testSmallArray() {
        assertEquals(2, P11ContainerWithMostWater.maxArea(new int[]{1, 2, 1}));
    }
}
