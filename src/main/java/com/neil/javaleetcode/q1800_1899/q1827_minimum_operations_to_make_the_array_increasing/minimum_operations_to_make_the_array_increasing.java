package com.neil.javaleetcode.q1800_1899.q1827_minimum_operations_to_make_the_array_increasing;
class minimum_operations_to_make_the_array_increasing {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int preMax = nums[0];
        int times = 0;
        for (int i = 1; i < n; ++i) {
            if (nums[i] <= preMax) {
                int steps = preMax - nums[i] + 1;
                times += steps;
                preMax = nums[i] + steps;
            } else {
                preMax = nums[i];
            }
        }
        return times;
    }
}
