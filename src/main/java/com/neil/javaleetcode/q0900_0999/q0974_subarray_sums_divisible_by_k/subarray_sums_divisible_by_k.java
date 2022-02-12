package com.neil.javaleetcode.q0900_0999.q0974_subarray_sums_divisible_by_k;


import java.util.*;



class subarray_sums_divisible_by_k {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        counter.put(0, 1);
        int s = 0, ans = 0;
        for (int num : nums) {
            s += num;
            int t = (s % k + k) % k;
            ans += counter.getOrDefault(t, 0);
            counter.put(t, counter.getOrDefault(t, 0) + 1);
        }
        return ans;
    }
}
