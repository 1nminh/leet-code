package org.adler.string;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class P28FindtheIndexoftheFirstOccurrenceinaStringTest {

    @Test
    void testFoundInMiddle() {
        assertEquals(2, P28FindtheIndexoftheFirstOccurrenceinaString.strStr("hello", "ll"));
    }

    @Test
    void testNotFound() {
        assertEquals(-1, P28FindtheIndexoftheFirstOccurrenceinaString.strStr("aaaaa", "bba"));
    }

    @Test
    void testFoundAtStart() {
        assertEquals(0, P28FindtheIndexoftheFirstOccurrenceinaString.strStr("sadbutsad", "sad"));
    }

    @Test
    void testSingleCharacter() {
        assertEquals(0, P28FindtheIndexoftheFirstOccurrenceinaString.strStr("a", "a"));
    }
}
