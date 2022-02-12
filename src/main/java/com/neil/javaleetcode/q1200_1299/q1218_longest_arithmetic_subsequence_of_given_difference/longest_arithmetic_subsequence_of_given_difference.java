package com.neil.javaleetcode.q1200_1299.q1218_longest_arithmetic_subsequence_of_given_difference;


import java.util.*;



class longest_arithmetic_subsequence_of_given_difference {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> dp = new HashMap<>();
        int ans = 1;
        for (int num : arr) {
            dp.put(num, dp.getOrDefault(num - difference, 0) + 1);
            ans = Math.max(ans, dp.get(num));
        }
        return ans;
    }
}
