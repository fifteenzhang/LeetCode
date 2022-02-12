package com.neil.javaleetcode.q0000_0099.q0003_longest_substring_without_repeating_characters;


import java.util.*;


class longest_substring_without_repeating_characters {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, ans = 0;
        Set<Character> chars = new HashSet<>();
        for (char c : s.toCharArray()) {
            while (chars.contains(c)) {
                chars.remove(s.charAt(i++));
            }
            chars.add(c);
            ans = Math.max(ans, j - i + 1);
            ++j;
        }
        return ans;
    }
}
