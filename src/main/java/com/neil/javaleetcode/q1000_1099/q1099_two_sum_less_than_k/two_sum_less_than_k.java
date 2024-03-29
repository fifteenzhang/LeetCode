package com.neil.javaleetcode.q1000_1099.q1099_two_sum_less_than_k;


import java.util.*;



class two_sum_less_than_k {
    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 0, high = nums.length - 1;
        int res = -1;
        while (low < high) {
            int val = nums[low] + nums[high];
            if (val < k) {
                res = Math.max(res, val);
                ++low;
            } else {
                --high;
            }
        }
        return res;
    }
}
