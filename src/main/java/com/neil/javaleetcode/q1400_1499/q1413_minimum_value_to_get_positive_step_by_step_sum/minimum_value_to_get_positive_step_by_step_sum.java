package com.neil.javaleetcode.q1400_1499.q1413_minimum_value_to_get_positive_step_by_step_sum;
class minimum_value_to_get_positive_step_by_step_sum {
    public int minStartValue(int[] nums) {
        int s = 0;
        int t = Integer.MAX_VALUE;
        for (int num : nums) {
            s += num;
            t = Math.min(t, s);
        }
        return Math.max(1, 1 - t);
    }
}
