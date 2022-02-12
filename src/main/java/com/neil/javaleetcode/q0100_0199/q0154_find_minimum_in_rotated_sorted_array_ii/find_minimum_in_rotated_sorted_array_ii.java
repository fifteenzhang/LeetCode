package com.neil.javaleetcode.q0100_0199.q0154_find_minimum_in_rotated_sorted_array_ii;
class find_minimum_in_rotated_sorted_array_ii {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int m = (l + r) >>> 1;
            if (nums[m] > nums[r]) l = m + 1;
            else if (nums[m] < nums[r]) r = m;
            else --r;
        }
        return nums[l];
    }
}
