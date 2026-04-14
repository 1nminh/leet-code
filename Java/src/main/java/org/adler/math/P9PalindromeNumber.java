package org.adler.math;

// Time: O(log n), Space: O(log n) // Approach: String reversal comparison
public class P9PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String tmpStr = String.valueOf(x);
        String reversed = new StringBuilder(tmpStr).reverse().toString();

        return tmpStr.equals(reversed);
    }
}
