package org.adler.string;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class P5LongestPalindromicSubstringTest {

    @Test
    void testOddLengthPalindrome() {
        String result = P5LongestPalindromicSubstring.longestPalindrome("babad");
        assertTrue(result.equals("bab") || result.equals("aba"));
    }

    @Test
    void testEvenLengthPalindrome() {
        assertEquals("bb", P5LongestPalindromicSubstring.longestPalindrome("cbbd"));
    }

    @Test
    void testSingleCharacter() {
        assertEquals("a", P5LongestPalindromicSubstring.longestPalindrome("a"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", P5LongestPalindromicSubstring.longestPalindrome(""));
    }

    @Test
    void testEntireStringPalindrome() {
        assertEquals("racecar", P5LongestPalindromicSubstring.longestPalindrome("racecar"));
    }
}
