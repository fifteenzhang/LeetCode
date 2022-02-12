package com.neil.javaleetcode.q1600_1699.q1658_minimum_operations_to_reduce_x_to_zero;


import java.util.*;


class minimum_operations_to_reduce_x_to_zero {
    public int minOperations(int[] nums, int x) {
        x = -x;
        for (int v : nums) {
            x += v;
        }
        int s = 0;
        int n = nums.length;
        Map<Integer, Integer> seen = new HashMap<>();
        seen.put(0, -1);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            s += nums[i];
            seen.putIfAbsent(s, i);
            if (seen.containsKey(s - x)) {
                int j = seen.get(s - x);
                ans = Math.min(ans, n - (i - j));
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
