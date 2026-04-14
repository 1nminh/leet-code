package org.adler.dp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class P10RegularExpressionMatchingTest {

    @Test
    void testNoMatch() {
        assertFalse(P10RegularExpressionMatching.isMatch("aa", "a"));
    }

    @Test
    void testStarMatchesMultiple() {
        assertTrue(P10RegularExpressionMatching.isMatch("aa", "a*"));
    }

    @Test
    void testDotStar() {
        assertTrue(P10RegularExpressionMatching.isMatch("ab", ".*"));
    }

    @Test
    void testComplexPattern() {
        assertTrue(P10RegularExpressionMatching.isMatch("aab", "c*a*b"));
    }

    @Test
    void testExactMatch() {
        assertTrue(P10RegularExpressionMatching.isMatch("abc", "abc"));
    }
}
