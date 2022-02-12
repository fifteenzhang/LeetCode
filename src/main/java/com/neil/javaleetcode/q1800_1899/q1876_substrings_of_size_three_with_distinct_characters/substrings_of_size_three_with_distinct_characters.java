package com.neil.javaleetcode.q1800_1899.q1876_substrings_of_size_three_with_distinct_characters;
class substrings_of_size_three_with_distinct_characters {
    public int countGoodSubstrings(String s) {
        int count = 0, n = s.length();
        for (int i = 0; i < n - 2; ++i) {
            char a = s.charAt(i), b = s.charAt(i + 1), c = s.charAt(i + 2);
            if (a != b && a != c && b != c) {
                ++count;
            }
        }
        return count;
    }
}
