package com.neil.javaleetcode.q1900_1999.q1920_build_array_from_permutation;
class build_array_from_permutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
