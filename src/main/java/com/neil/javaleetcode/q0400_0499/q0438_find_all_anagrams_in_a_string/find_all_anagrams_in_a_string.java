package com.neil.javaleetcode.q0400_0499.q0438_find_all_anagrams_in_a_string;


import java.util.*;



class find_all_anagrams_in_a_string {
    public List<Integer> findAnagrams(String s, String p) {
        int[] counter = new int[26];
        for (char c : p.toCharArray()) {
            ++counter[c - 'a'];
        }
        List<Integer> ans = new ArrayList<>();
        int left = 0, right = 0;
        int[] t = new int[26];
        while (right < s.length()) {
            int i = s.charAt(right) - 'a';
            ++t[i];
            while (t[i] > counter[i]) {
                --t[s.charAt(left) - 'a'];
                ++left;
            }
            if (right - left + 1 == p.length()) {
                ans.add(left);
            }
            ++right;
        }
        return ans;
    }
}
