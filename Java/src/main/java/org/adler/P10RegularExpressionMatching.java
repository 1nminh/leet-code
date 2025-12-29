package org.adler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P10RegularExpressionMatching {
    public static void main(String[] args) throws Exception {
        System.out.println("Problem 10");
        P10RegularExpressionMatching solution = new P10RegularExpressionMatching();
        System.out.println(solution.isMatch("aa", "a")); // false
        System.out.println(solution.isMatch("aa", "a*")); // true
        System.out.println(solution.isMatch("ab", ".*")); // true
        System.out.println(solution.isMatch("aab", "c*a*b")); // true
        System.out.println(solution.isMatch("mississippi", "mis*is*p*."));

    }

    public boolean isMatch(String s, String p) {
        Pattern MY_PATTERN = Pattern.compile(p);
        Matcher m = MY_PATTERN.matcher(s);
        if (m.matches()){
            return true;
        }
        return false;
    }
}
