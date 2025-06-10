package org.adler;

public class P28FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        System.out.println("Problem 28");
        String haystack = "hello";
        String needle = "ll";
        int index = strStr(haystack, needle);
        System.out.println("Index: " + index);
    }

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
