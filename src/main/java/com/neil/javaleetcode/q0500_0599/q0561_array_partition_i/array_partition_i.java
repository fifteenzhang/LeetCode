package com.neil.javaleetcode.q0500_0599.q0561_array_partition_i;


import java.util.*;


class array_partition_i {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0, n = nums.length; i < n; i += 2) {
            res += nums[i];
        }
        return res;
    }
}
