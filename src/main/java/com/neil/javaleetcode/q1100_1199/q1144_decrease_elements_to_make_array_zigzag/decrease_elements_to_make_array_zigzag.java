package com.neil.javaleetcode.q1100_1199.q1144_decrease_elements_to_make_array_zigzag;
class decrease_elements_to_make_array_zigzag {
    public int movesToMakeZigzag(int[] nums) {
        int[] res = new int[2];
        for (int i = 0, n = nums.length; i < n; ++i) {
            int left = i > 0 ? nums[i - 1] : Integer.MAX_VALUE;
            int right = i + 1 < n ? nums[i + 1] : Integer.MAX_VALUE;
            res[i & 1] += Math.max(0, nums[i] - (Math.min(left, right) - 1));
        }
        return Math.min(res[0], res[1]);
    }
}
