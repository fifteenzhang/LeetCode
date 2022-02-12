package com.neil.javaleetcode.q1800_1899.q1877_minimize_maximum_pair_sum_in_array;


import java.util.*;


class minimize_maximum_pair_sum_in_array {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0, n = nums.length;
        for (int i = 0; i < (n >> 1); ++i) {
            res = Math.max(res, nums[i] + nums[n - i - 1]);
        }
        return res;
    }
}
