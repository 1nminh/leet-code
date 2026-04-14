package org.adler.math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class P9PalindromeNumberTest {

    @Test
    void testPalindrome() {
        assertTrue(P9PalindromeNumber.isPalindrome(121));
    }

    @Test
    void testNegativeNumber() {
        assertFalse(P9PalindromeNumber.isPalindrome(-121));
    }

    @Test
    void testEndsWithZero() {
        assertFalse(P9PalindromeNumber.isPalindrome(10));
    }

    @Test
    void testZero() {
        assertTrue(P9PalindromeNumber.isPalindrome(0));
    }

    @Test
    void testSingleDigit() {
        assertTrue(P9PalindromeNumber.isPalindrome(7));
    }
}
