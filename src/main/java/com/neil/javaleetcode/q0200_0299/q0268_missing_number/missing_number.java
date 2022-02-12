package com.neil.javaleetcode.q0200_0299.q0268_missing_number;
class missing_number {
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for (int i = 0, n = res; i < n; ++i) {
            res ^= (i ^ nums[i]);
        }
        return res;
    }
}
