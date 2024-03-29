package com.neil.javaleetcode.q1400_1499.q1464_maximum_product_of_two_elements_in_an_array;
class maximum_product_of_two_elements_in_an_array {
    public int maxProduct(int[] nums) {
        int i = nums[0] > nums[1] ? 0 : 1;
        int j = 1 - i;
        for (int k = 2; k < nums.length; ++k) {
            if (nums[k] > nums[i]) {
                j = k;
                int t = i;
                i = j;
                j = t;
            } else if (nums[k] > nums[j]) {
                j = k;
            }
        }
        return (nums[i] - 1) * (nums[j] - 1);
    }
}
