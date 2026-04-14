package org.adler.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class P3LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void testMixedRepeats() {
        assertEquals(3, P3LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void testAllSameCharacters() {
        assertEquals(1, P3LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void testRepeatingAtStart() {
        assertEquals(3, P3LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, P3LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(""));
    }

    @Test
    void testAllUnique() {
        assertEquals(4, P3LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcd"));
    }
}
