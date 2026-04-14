package org.adler.binarysearch;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class P35SearchInsertPositionTest {

    @Test
    void testTargetExists() {
        assertEquals(2, P35SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    void testInsertInMiddle() {
        assertEquals(1, P35SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    @Test
    void testInsertAtEnd() {
        assertEquals(4, P35SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    @Test
    void testInsertAtBeginning() {
        assertEquals(0, P35SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
}
