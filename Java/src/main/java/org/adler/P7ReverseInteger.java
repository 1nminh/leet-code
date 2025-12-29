package org.adler;

public class P7ReverseInteger {
    public static void main(String[] args) throws Exception {
        System.out.println("Problem 7");

        int x = 123;
        System.out.println("Reversed integer: " + reverse(x));

        x = -321;
        System.out.println("Reversed integer: " + reverse(x));
    }

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