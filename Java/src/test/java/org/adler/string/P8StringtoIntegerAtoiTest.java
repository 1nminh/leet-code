package org.adler.string;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class P8StringtoIntegerAtoiTest {

    @Test
    void testPositiveNumber() {
        assertEquals(42, P8StringtoIntegerAtoi.myAtoi("42"));
    }

    @Test
    void testLeadingWhitespaceAndNegative() {
        assertEquals(-42, P8StringtoIntegerAtoi.myAtoi("   -42"));
    }

    @Test
    void testTrailingWords() {
        assertEquals(4193, P8StringtoIntegerAtoi.myAtoi("4193 with words"));
    }

    @Test
    void testLeadingWords() {
        assertEquals(0, P8StringtoIntegerAtoi.myAtoi("words and 987"));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, P8StringtoIntegerAtoi.myAtoi(""));
    }
}
