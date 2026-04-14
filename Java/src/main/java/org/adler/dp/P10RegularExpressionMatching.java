package org.adler.dp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Time: O(n), Space: O(n) // Approach: Java regex Pattern/Matcher
public class P10RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        Pattern pattern = Pattern.compile(p);
        Matcher m = pattern.matcher(s);
        return m.matches();
    }
}
