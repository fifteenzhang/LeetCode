package com.neil.javaleetcode.q0200_0299.q0283_move_zeroes;
class move_zeroes {
    public void moveZeroes(int[] nums) {
        int left = 0, n = nums.length;
        for (int right = 0; right < n; ++right) {
            if (nums[right] != 0) {
                int t = nums[left];
                nums[left] = nums[right];
                nums[right] = t;
                ++left;
            }
        }
    }
}
