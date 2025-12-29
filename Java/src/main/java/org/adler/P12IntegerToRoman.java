package org.adler;

public class P12IntegerToRoman {
    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        System.out.println("Problem 12:");
        System.out.println(intToRoman(58));   // "LVIII"
        System.out.println(intToRoman(3));    // "III"
        System.out.println(intToRoman(4));    // "IV"
        System.out.println(intToRoman(9));    // "IX"

        System.out.println(intToRoman(1994)); // "MCMXCIV"
    }
}



