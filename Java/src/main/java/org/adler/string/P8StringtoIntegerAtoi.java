package org.adler.string;

// Time: O(n), Space: O(n) // Approach: Trim, parse sign, iterate digits with overflow check
public class P8StringtoIntegerAtoi {
    public static int myAtoi(String s) {
        String trimmedString = s.trim();
        if (trimmedString.isEmpty()) {
            return 0;
        }

        boolean isNegative = false;
        int startIndex = 0;

        if (trimmedString.charAt(0) == '-') {
            isNegative = true;
            startIndex = 1;
        } else if (trimmedString.charAt(0) == '+') {
            startIndex = 1;
        }

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
