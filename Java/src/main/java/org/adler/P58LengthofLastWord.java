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
        String trimmed = s.trim();
        int lastSpaceIndex = trimmed.lastIndexOf(' ');
        if (lastSpaceIndex == -1) {
            return trimmed.length();
        }
        return trimmed.length() - lastSpaceIndex - 1;        
    }
}
