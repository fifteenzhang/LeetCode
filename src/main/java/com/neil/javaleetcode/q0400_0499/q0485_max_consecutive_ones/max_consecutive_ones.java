package com.neil.javaleetcode.q0400_0499.q0485_max_consecutive_ones;
class max_consecutive_ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0, t = 0;
        for (int num : nums) {
            if (num == 1) {
                ++t;
            } else {
                res = Math.max(res, t);
                t = 0;
            }
        }
        return Math.max(res, t);
    }
}
