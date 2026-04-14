package org.adler.slidingwindow;

import java.util.Arrays;

// Time: O(n), Space: O(1) // Approach: Sliding window with char index array
public class P3LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (charIndex[currentChar] >= start) {
                start = charIndex[currentChar] + 1;
            }
            charIndex[currentChar] = i;
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
}
