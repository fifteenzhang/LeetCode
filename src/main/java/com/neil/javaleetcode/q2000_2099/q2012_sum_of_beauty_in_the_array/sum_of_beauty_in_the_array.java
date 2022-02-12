package com.neil.javaleetcode.q2000_2099.q2012_sum_of_beauty_in_the_array;
class sum_of_beauty_in_the_array {
    public int sumOfBeauties(int[] nums) {
        int n = nums.length;
        int[] lmx = new int[n];
        int[] rmi = new int[n];
        rmi[n - 1] = 100001;
        for (int i = 1; i < n; ++i) {
            lmx[i] = Math.max(lmx[i - 1], nums[i - 1]);
        }
        for (int i = n - 2; i >= 0; --i) {
            rmi[i] = Math.min(rmi[i + 1], nums[i + 1]);
        }
        int ans = 0;
        for (int i = 1; i < n - 1; ++i) {
            if (lmx[i] < nums[i] && nums[i] < rmi[i]) {
                ans += 2;
            } else if (nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) {
                ans += 1;
            }
        }
        return ans;
    }
}
