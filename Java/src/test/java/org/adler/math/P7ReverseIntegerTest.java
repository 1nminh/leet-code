package org.adler.math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class P7ReverseIntegerTest {

    @Test
    void testPositiveNumber() {
        assertEquals(321, P7ReverseInteger.reverse(123));
    }

    @Test
    void testNegativeNumber() {
        assertEquals(-321, P7ReverseInteger.reverse(-123));
    }

    @Test
    void testTrailingZero() {
        assertEquals(21, P7ReverseInteger.reverse(120));
    }

    @Test
    void testZero() {
        assertEquals(0, P7ReverseInteger.reverse(0));
    }

    @Test
    void testOverflow() {
        assertEquals(0, P7ReverseInteger.reverse(1534236469));
    }
}
