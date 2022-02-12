package com.neil.javaleetcode.q1400_1499.q1480_running_sum_of_1d_array;
class running_sum_of_1d_array {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; ++i) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
