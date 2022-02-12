package com.neil.javaleetcode.q0100_0199.q0152_maximum_product_subarray;
class maximum_product_subarray {
    public int maxProduct(int[] nums) {
        int maxf = nums[0], minf = nums[0], res = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            int m = maxf, n = minf;
            maxf = Math.max(nums[i], Math.max(m * nums[i], n * nums[i]));
            minf = Math.min(nums[i], Math.min(m * nums[i], n * nums[i]));
            res = Math.max(res, maxf);
        }
        return res;
    }
}
