package org.adler;

import java.util.Arrays;

public class P3LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) throws Exception {
        System.out.println("Problem 3");
        String s = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters: " + "String: " + s + ", Length: " + lengthOfLongestSubstring(s)); // Output: 3

        s = "bbbbb";
        System.out.println("Length of longest substring without repeating characters: " + "String: " + s + ", Length: " + lengthOfLongestSubstring(s)); // Output: 1

        s = "pwwkew";
        System.out.println("Length of longest substring without repeating characters: " + "String: " + s + ", Length: " + lengthOfLongestSubstring(s)); // Output: 3

    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        int[] charIndex = new int[128]; // Assuming ASCII
        Arrays.fill(charIndex, -1); // Initialize all indices to -1
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);            
            // If the character has been seen and is within the current substring
            if (charIndex[currentChar] >= start) {
                start = charIndex[currentChar] + 1; // Move start to the right of the last occurrence
            }
            charIndex[currentChar] = i; // Update the last occurrence index
            maxLength = Math.max(maxLength, i - start + 1); // Calculate the max length
        }
        return maxLength;
    }
}