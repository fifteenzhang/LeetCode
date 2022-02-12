package com.neil.javaleetcode.q2100_2199.q2134_minimum_swaps_to_group_all_1s_together_ii;
class minimum_swaps_to_group_all_1s_together_ii {
    public int minSwaps(int[] nums) {
        int cnt = 0;
        for (int v : nums) {
            cnt += v;
        }
        int n = nums.length;
        int[] s = new int[(n << 1) + 1];
        for (int i = 0; i < (n << 1); ++i) {
            s[i + 1] = s[i] + nums[i % n];
        }
        int mx = 0;
        for (int i = 0; i < (n << 1); ++i) {
            int j = i + cnt - 1;
            if (j < (n << 1)) {
                mx = Math.max(mx, s[j + 1] - s[i]);
            }
        }
        return cnt - mx;
    }
}
