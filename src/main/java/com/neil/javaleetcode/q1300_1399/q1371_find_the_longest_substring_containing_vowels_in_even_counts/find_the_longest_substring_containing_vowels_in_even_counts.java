package com.neil.javaleetcode.q1300_1399.q1371_find_the_longest_substring_containing_vowels_in_even_counts;


import java.util.*;


class find_the_longest_substring_containing_vowels_in_even_counts {
    public int findTheLongestSubstring(String s) {
        int[] pos = new int[32];
        Arrays.fill(pos, Integer.MAX_VALUE);
        pos[0] = -1;
        String vowels = "aeiou";
        int state = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            for (int j = 0; j < 5; ++j) {
                if (c == vowels.charAt(j)) {
                    state ^= (1 << j);
                }
            }
            ans = Math.max(ans, i - pos[state]);
            pos[state] = Math.min(pos[state], i);
        }
        return ans;
    }
}
