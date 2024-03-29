package com.neil.javaleetcode.q0400_0499.q0454_4sum_ii;

import java.util.HashMap;
import java.util.Map;

class four_sum_ii {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int a : nums1) {
            for (int b : nums2) {
                counter.put(a + b, counter.getOrDefault(a + b, 0) + 1);
            }
        }
        int ans = 0;
        for (int c : nums3) {
            for (int d : nums4) {
                ans += counter.getOrDefault(-(c + d), 0);
            }
        }
        return ans;
    }
}
