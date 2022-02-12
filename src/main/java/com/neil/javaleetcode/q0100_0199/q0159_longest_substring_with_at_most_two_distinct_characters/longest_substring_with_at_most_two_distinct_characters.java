package com.neil.javaleetcode.q0100_0199.q0159_longest_substring_with_at_most_two_distinct_characters;


import java.util.*;


class longest_substring_with_at_most_two_distinct_characters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int i = 0, j = 0, ans = 0;
        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
            while (mp.size() > 2) {
                char t = s.charAt(i);
                mp.put(t, mp.get(t) - 1);
                if (mp.get(t) == 0) {
                    mp.remove(t);
                }
                ++i;
            }
            ans = Math.max(ans, j - i + 1);
            ++j;
        }
        return ans;
    }
}
