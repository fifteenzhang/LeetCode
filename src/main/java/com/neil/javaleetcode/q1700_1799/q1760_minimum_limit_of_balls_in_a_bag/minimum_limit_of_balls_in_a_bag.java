package com.neil.javaleetcode.q1700_1799.q1760_minimum_limit_of_balls_in_a_bag;
class minimum_limit_of_balls_in_a_bag {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = 1000000000;
        while (left < right) {
            int mid = (left + right) >>> 1;
            long ops = 0;
            for (int num : nums) {
                ops += (num - 1) / mid;
            }
            if (ops <= maxOperations) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
