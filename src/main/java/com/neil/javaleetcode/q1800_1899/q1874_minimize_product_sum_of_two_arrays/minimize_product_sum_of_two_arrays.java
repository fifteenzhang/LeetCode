package com.neil.javaleetcode.q1800_1899.q1874_minimize_product_sum_of_two_arrays;

import java.util.Arrays;

class minimize_product_sum_of_two_arrays {
    public int minProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length, res = 0;
        for (int i = 0; i < n; ++i) {
            res += nums1[i] * nums2[n - i - 1];
        }
        return res;
    }
}
