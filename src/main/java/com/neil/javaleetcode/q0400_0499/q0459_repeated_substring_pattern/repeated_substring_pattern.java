package com.neil.javaleetcode.q0400_0499.q0459_repeated_substring_pattern;
class repeated_substring_pattern {
    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }
}
