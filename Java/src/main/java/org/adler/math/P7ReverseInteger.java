package org.adler.math;

// Time: O(log x), Space: O(log x) // Approach: String reversal with overflow check
public class P7ReverseInteger {
    public static int reverse(int x) {
        boolean isNegative = x < 0;
        String original = Integer.toString(Math.abs(x));
        String reversedStr = new StringBuilder(original).reverse().toString();
        try {
            int reversed = Integer.parseInt(reversedStr);
            return isNegative ? -reversed : reversed;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
