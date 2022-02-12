package com.neil.javaleetcode.q0100_0199.q0136_single_number;
class single_number {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
