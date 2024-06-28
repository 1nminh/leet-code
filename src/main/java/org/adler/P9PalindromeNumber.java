package org.adler;

class P9PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Problem 9 palindrome number");
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(11));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String tmpStr = String.valueOf(x);
        String reversed = new StringBuilder(tmpStr).reverse().toString();

        return tmpStr.equals(reversed);
    }
}
