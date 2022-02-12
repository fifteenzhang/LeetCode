package com.neil.javaleetcode.q0300_0399.q0384_shuffle_an_array;

import java.util.Arrays;
import java.util.Random;

class shuffle_an_array {
    private int[] nums;
    private int[] original;
    private Random rand;

    public shuffle_an_array(int[] nums) {
        this.nums = nums;
        this.original = Arrays.copyOf(nums, nums.length);
        this.rand = new Random();
    }
    
    public int[] reset() {
        nums = Arrays.copyOf(original, original.length);
        return nums;
    }
    
    public int[] shuffle() {
        for (int i = 0; i < nums.length; ++i) {
            swap(i, i + rand.nextInt(nums.length - i));
        }
        return nums;
    }

    private void swap(int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
