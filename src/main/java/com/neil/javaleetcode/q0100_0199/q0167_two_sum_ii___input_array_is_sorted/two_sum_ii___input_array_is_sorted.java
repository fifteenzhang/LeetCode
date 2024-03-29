package com.neil.javaleetcode.q0100_0199.q0167_two_sum_ii___input_array_is_sorted;
class two_sum_ii___input_array_is_sorted {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            }
            if (numbers[left] + numbers[right] < target) {
                ++left;
            } else {
                --right;
            }
        }
        return new int[]{-1, -1};
    }
}
