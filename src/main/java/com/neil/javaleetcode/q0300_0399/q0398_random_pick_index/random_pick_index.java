package com.neil.javaleetcode.q0300_0399.q0398_random_pick_index;

import java.util.Random;

class random_pick_index {
    private int[] nums;
    private Random random = new Random();

    public random_pick_index(int[] nums) {
        this.nums = nums;
    }
    
    public int pick(int target) {
        int n = 0, ans = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == target) {
                ++n;
                int x = 1 + random.nextInt(n);
                if (x == n) {
                    ans = i;
                }
            }
        }
        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
