package com.neil.javaleetcode.q1800_1899.q1887_reduction_operations_to_make_the_array_elements_equal;


import java.util.*;



class reduction_operations_to_make_the_array_elements_equal {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int cnt = 0, res = 0, n = nums.length;
        for (int i = 1; i < n; ++i) {
            if (nums[i] != nums[i - 1]) {
                ++cnt;
            }
            res += cnt;
        }
        return res;
    }
}
