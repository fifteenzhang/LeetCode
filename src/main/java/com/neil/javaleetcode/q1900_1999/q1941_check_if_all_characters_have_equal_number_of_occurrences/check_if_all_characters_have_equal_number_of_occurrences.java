package com.neil.javaleetcode.q1900_1999.q1941_check_if_all_characters_have_equal_number_of_occurrences;
class check_if_all_characters_have_equal_number_of_occurrences {
    public boolean areOccurrencesEqual(String s) {
        int[] counter = new int[26];
        for (char c : s.toCharArray()) {
            ++counter[c - 'a'];
        }
        int cnt = -1;
        for (int i = 0; i < 26; ++i) {
            if (counter[i] == 0) {
                continue;
            }

            if (cnt == -1) {
                cnt = counter[i];
            } else if (cnt != counter[i]) {
                return false;
            }
        }
        return true;
    }
}
