package org.adler.string;

// Time: O(n*m), Space: O(m) // Approach: Sliding window substring comparison
public class P28FindtheIndexoftheFirstOccurrenceinaString {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return -1;
        if (haystack.contains(needle)) {
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
