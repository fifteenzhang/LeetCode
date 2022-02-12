package com.neil.javaleetcode.q2000_2099.q2083_substrings_that_begin_and_end_with_the_same_letter;
class substrings_that_begin_and_end_with_the_same_letter {
    public long numberOfSubstrings(String s) {
        int[] counter = new int[26];
        long ans = 0;
        for (char c : s.toCharArray()) {
            int i = c - 'a';
            ++counter[i];
            ans += counter[i];
        }
        return ans;
    }
}
