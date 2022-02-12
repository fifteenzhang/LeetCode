package com.neil.javaleetcode.q1200_1299.q1221_split_a_string_in_balanced_strings;
class split_a_string_in_balanced_strings {
    public int balancedStringSplit(String s) {
        int n = 0, res = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                ++n;
            } else {
                --n;
            }
            if (n == 0) {
                ++res;
            }
        }
        return res;
    }
}
