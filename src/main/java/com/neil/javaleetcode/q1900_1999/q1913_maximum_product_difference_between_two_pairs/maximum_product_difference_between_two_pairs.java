package com.neil.javaleetcode.q1900_1999.q1913_maximum_product_difference_between_two_pairs;


import java.util.*;


class maximum_product_difference_between_two_pairs {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n - 1] * nums[n - 2] - nums[0] * nums[1];
    }
}
