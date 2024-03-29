package com.neil.javaleetcode.q1800_1899.q1800_maximum_ascending_subarray_sum;
class maximum_ascending_subarray_sum {
    public int maxAscendingSum(int[] nums) {
        int cur = nums[0];
        int res = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > nums[i - 1]) {
                cur += nums[i];
            } else {
                res = Math.max(res, cur);
                cur = nums[i];
            }
        }
        res = Math.max(res, cur);
        return res;
    }
}
