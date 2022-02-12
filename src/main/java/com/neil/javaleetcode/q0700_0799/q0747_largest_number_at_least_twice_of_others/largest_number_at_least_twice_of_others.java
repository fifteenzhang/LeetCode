package com.neil.javaleetcode.q0700_0799.q0747_largest_number_at_least_twice_of_others;
class largest_number_at_least_twice_of_others {
    public int dominantIndex(int[] nums) {
        int mx = Integer.MIN_VALUE, mid = Integer.MIN_VALUE;
        int ans = -1;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > mx) {
                mid = mx;
                mx = nums[i];
                ans = i;
            } else if (nums[i] > mid) {
                mid = nums[i];
            }
        }
        return mx >= mid * 2 ? ans : -1;
    }
}
