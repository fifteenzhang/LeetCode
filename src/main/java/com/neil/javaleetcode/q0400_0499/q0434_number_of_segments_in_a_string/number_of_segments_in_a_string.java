package com.neil.javaleetcode.q0400_0499.q0434_number_of_segments_in_a_string;
class number_of_segments_in_a_string {
    public int countSegments(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                ++res;
            }
        }
        return res;
    }
}
