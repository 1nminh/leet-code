package org.adler;

public class P6ZigzagConversion {
    public static void main(String[] args) throws Exception {
        System.out.println("Problem 6");

        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println("Zigzag conversion: " + convert(s, numRows));
    }

    public static String convert(String s, int numRows) {
        
        if (numRows <= 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }



        return "";
    }

}