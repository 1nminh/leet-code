package org.adler;

public class P5LongestPalindromicSubstring {
    public static void main(String[] args) throws Exception {
        System.out.println("Problem 5");

        String s = "aacabdkacaa";
        System.out.println("Longest palindromic substring: " + longestPalindrome(s));

        s = "babad";
        System.out.println("Longest palindromic substring: " + longestPalindrome(s)); // Output: "bab" or "aba"

        s = "cbbd";
        System.out.println("Longest palindromic substring: " + longestPalindrome(s)); // Output: "bb"

        s = "a";
        System.out.println("Longest palindromic substring: " + longestPalindrome(s)); // Output: "a"
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }

        int start = 0;
        int maxLen = 1;

        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int currentLen = j - i + 1;

                if (currentLen > maxLen && s.charAt(i) == s.charAt(j)) {
                    String sub = s.substring(i, j + 1);
                    if (isPalindrome(sub)) {
                        maxLen = currentLen;
                        start = i;
                    }
                }
            }
        }

        return s.substring(start, start + maxLen);
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}