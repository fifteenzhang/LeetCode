package com.neil.javaleetcode.q0200_0299.q0242_valid_anagram;
class valid_anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            ++chars[s.charAt(i) - 'a'];
            --chars[t.charAt(i) - 'a'];
        }
        for (int c : chars) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
}
