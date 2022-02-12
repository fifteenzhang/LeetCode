package com.neil.javaleetcode.q2000_2099.q2091_removing_minimum_and_maximum_from_array;
class removing_minimum_and_maximum_from_array {
    public int minimumDeletions(int[] nums) {
        int mi = 0, mx = 0, n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] < nums[mi]) {
                mi = i;
            }
            if (nums[i] > nums[mx]) {
                mx = i;
            }
        }
        if (mi > mx) {
            int t = mx;
            mx = mi;
            mi = t;
        }
        return Math.min(Math.min(mx + 1, n - mi), mi + 1 + n - mx);
    }
}
