package com.neil.javaleetcode.q2100_2199.q2149_rearrange_array_elements_by_sign;
class rearrange_array_elements_by_sign {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0, j = 1;
        for (int num : nums) {
            if (num > 0) {
                ans[i] = num;
                i += 2;
            } else {
                ans[j] = num;
                j += 2;
            }
        }
        return ans;
    }
}
