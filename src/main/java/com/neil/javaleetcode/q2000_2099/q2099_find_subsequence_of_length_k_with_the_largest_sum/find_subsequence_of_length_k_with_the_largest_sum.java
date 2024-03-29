package com.neil.javaleetcode.q2000_2099.q2099_find_subsequence_of_length_k_with_the_largest_sum;


import java.util.*;


class find_subsequence_of_length_k_with_the_largest_sum {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] ans = new int[k];
        List<Integer> idx = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            idx.add(i);
        }
        idx.sort(Comparator.comparingInt(i -> -nums[i]));
        int[] t = new int[k];
        for (int i = 0; i < k; ++i) {
            t[i] = idx.get(i);
        }
        Arrays.sort(t);
        for (int i = 0; i < k; ++i) {
            ans[i] = nums[t[i]];
        }
        return ans;
    }
}
