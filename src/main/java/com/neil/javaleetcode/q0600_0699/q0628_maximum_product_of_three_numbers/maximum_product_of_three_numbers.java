package com.neil.javaleetcode.q0600_0699.q0628_maximum_product_of_three_numbers;


import java.util.*;


class maximum_product_of_three_numbers {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 1] * nums[n - 2] * nums[n - 3]);
    }
}
