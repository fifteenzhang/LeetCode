package com.neil.javaleetcode.q1600_1699.q1684_count_the_number_of_consistent_strings;
class count_the_number_of_consistent_strings {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] chars = new boolean[26];
        for (char c : allowed.toCharArray()) {
            chars[c - 'a'] = true;
        }
        int res = 0;
        for (String word : words) {
            boolean find = true;
            for (char c : word.toCharArray()) {
                if (!chars[c - 'a']) {
                    find = false;
                    break;
                }
            }
            if (find) {
                ++res;
            }
        }
        return res;
    }
}
