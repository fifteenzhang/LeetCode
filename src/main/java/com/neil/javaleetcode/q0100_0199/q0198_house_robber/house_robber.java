package com.neil.javaleetcode.q0100_0199.q0198_house_robber;
class house_robber {
    public int rob(int[] nums) {
        int a = 0, b = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            int c = Math.max(nums[i] + a, b);
            a = b;
            b = c;
        }
        return b;
    }
}
