package com.neil.javaleetcode.q0300_0399.q0387_first_unique_character_in_a_string;
class first_unique_character_in_a_string {
    public int firstUniqChar(String s) {
        int[] counter = new int[26];
        for (char c : s.toCharArray()) {
            ++counter[c - 'a'];
        }
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (counter[c - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
