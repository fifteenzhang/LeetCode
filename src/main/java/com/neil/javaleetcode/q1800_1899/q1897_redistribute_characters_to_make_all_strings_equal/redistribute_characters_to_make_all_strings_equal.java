package com.neil.javaleetcode.q1800_1899.q1897_redistribute_characters_to_make_all_strings_equal;
class redistribute_characters_to_make_all_strings_equal {
    public boolean makeEqual(String[] words) {
        int[] counter = new int[26];
        for (String word : words) {
            for (char c : word.toCharArray()) {
                ++counter[c - 'a'];
            }
        }
        int n = words.length;
        for (int i = 0; i < 26; ++i) {
            if (counter[i] % n != 0) {
                return false;
            }
        }
        return true;
    }
}
