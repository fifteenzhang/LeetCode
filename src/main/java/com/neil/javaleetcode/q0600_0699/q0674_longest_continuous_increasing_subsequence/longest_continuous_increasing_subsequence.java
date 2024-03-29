package com.neil.javaleetcode.q0600_0699.q0674_longest_continuous_increasing_subsequence;
class longest_continuous_increasing_subsequence {
    public int findLengthOfLCIS(int[] nums) {
        int res = 1;
        for (int i = 1, f = 1; i < nums.length; ++i) {
            f = 1 + (nums[i - 1] < nums[i] ? f : 0);
            res = Math.max(res, f);
        }
        return res;
    }
}
