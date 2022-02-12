package com.neil.javaleetcode.q0400_0499.q0413_arithmetic_slices;
class arithmetic_slices {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = 2; i < n; ++i) {
            if (nums[i] + nums[i - 2] == (nums[i - 1] << 1)) {
                dp[i] = 1 + dp[i - 1];
            }
        }
        int res = 0;
        for (int e : dp) {
            res += e;
        }
        return res;
    }
}
