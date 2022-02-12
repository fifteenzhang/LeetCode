package com.neil.javaleetcode.q1500_1599.q1576_replace_alls_to_avoid_consecutive_repeating_characters;
class replace_alls_to_avoid_consecutive_repeating_characters {
    public String modifyString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            char c = chars[i];
            if (c == '?') {
                for (char cc = 'a'; cc <= 'c'; ++cc) {
                    if (i > 0 && chars[i - 1] == cc) {
                        continue;
                    }
                    if (i < chars.length - 1 && chars[i + 1] == cc) {
                        continue;
                    }
                    chars[i] = cc;
                    break;
                }
            }
        }
        return String.valueOf(chars);
    }
}
