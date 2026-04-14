package org.adler.string;

// Time: O(n), Space: O(n) // Approach: Trim then find last space
public class P58LengthofLastWord {
    public static int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        int lastSpaceIndex = trimmed.lastIndexOf(' ');
        if (lastSpaceIndex == -1) {
            return trimmed.length();
        }
        return trimmed.length() - lastSpaceIndex - 1;
    }
}
