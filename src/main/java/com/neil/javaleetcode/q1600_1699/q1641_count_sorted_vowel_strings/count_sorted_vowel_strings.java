package com.neil.javaleetcode.q1600_1699.q1641_count_sorted_vowel_strings;


import java.util.*;



class count_sorted_vowel_strings {
    public int countVowelStrings(int n) {
        int[] cnt = new int[5];
        Arrays.fill(cnt, 1);
        for (int i = 2; i <= n; ++i) {
            for (int j = 3; j >= 0; --j) {
                cnt[j] += cnt[j + 1];
            }
        }
        return Arrays.stream(cnt).sum();
    }
}
