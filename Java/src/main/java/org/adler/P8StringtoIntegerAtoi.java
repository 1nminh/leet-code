package org.adler;

public class P8StringtoIntegerAtoi {

    public static void main(String[] args) throws Exception {
        System.out.println("Problem 8");

        System.out.println(myAtoi("   -42"));
        System.out.println(myAtoi("1337c0d3"));
        System.out.println(myAtoi("0-1"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("words and 987"));
    }

    public static int myAtoi(String s) {
        String trimmedString = s.trim();
        if (trimmedString.isEmpty()) {
            return 0;
        }

        boolean isNegative = false;
        int startIndex = 0;

        // check sign
        if (trimmedString.charAt(0) == '-') {
            isNegative = true;
            startIndex = 1;
        } else if (trimmedString.charAt(0) == '+') {
            startIndex = 1;
        }

        // check if first non-sign char is digit
        if (startIndex >= trimmedString.length() || !Character.isDigit(trimmedString.charAt(startIndex))) {
            return 0;
        }

        int result = 0;
        for (int i = startIndex; i < trimmedString.length(); i++) {
            char currentChar = trimmedString.charAt(i);
            if (!Character.isDigit(currentChar)) {
                break;
            }

            int digit = Character.getNumericValue(currentChar);

            // check overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;
        }
        if (isNegative) {
            result = -result;
        }
        return result;
    }
}
