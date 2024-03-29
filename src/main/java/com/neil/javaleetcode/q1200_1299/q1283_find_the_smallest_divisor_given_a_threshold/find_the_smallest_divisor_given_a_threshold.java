package com.neil.javaleetcode.q1200_1299.q1283_find_the_smallest_divisor_given_a_threshold;
class find_the_smallest_divisor_given_a_threshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = 1000000;
        while (left < right) {
            int mid = (left + right) >> 1;
            int s = 0;
            for (int num : nums) {
                s += (num + mid - 1) / mid;
            }
            if (s <= threshold) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
