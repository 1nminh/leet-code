package org.adler;

public class P58LengthofLastWord {
    public static void main(String[] args) {
        System.out.println("Problem 58");
        String s = "Hello World";
        P58LengthofLastWord solution = new P58LengthofLastWord();
        System.out.println("Length of last word: " + solution.lengthOfLastWord(s)); // Output: 5
        s = "   fly me   to   the moon  ";
        System.out.println("Length of last word: " + solution.lengthOfLastWord(s)); // Output: 4
    }

    public int lengthOfLastWord(String s) {        
        s = s.trim();
        s = s.substring(s.lastIndexOf(" ") + 1);
        if (s.length() > 0) {
            return s.length();
        }
        return 0;
    }
}
