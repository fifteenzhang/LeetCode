package com.neil.javaleetcode.q0100_0199.q0153_find_minimum_in_rotated_sorted_array;
class find_minimum_in_rotated_sorted_array {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        if (nums[l] < nums[r]) return nums[0];
        while (l < r) {
            int m = (l + r) >>> 1;
            if (nums[m] > nums[r]) l = m + 1;
            else r = m;
        }
        return nums[l];
    }
}
