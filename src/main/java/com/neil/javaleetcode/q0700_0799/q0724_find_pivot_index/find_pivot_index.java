package com.neil.javaleetcode.q0700_0799.q0724_find_pivot_index;
class find_pivot_index {
    public int pivotIndex(int[] nums) {
        int n = nums.length, s = 0;
        for (int e : nums) {
            s += e;
        }
        int presum = 0;
        for (int i = 0; i < n; ++i) {
            // presum == sums - nums[i] - presum
            if (presum << 1 == s - nums[i]) {
                return i;
            }
            presum += nums[i];
        }
        return -1;
    }
}
