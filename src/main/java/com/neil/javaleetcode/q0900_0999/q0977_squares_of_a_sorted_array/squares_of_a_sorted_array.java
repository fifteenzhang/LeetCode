package com.neil.javaleetcode.q0900_0999.q0977_squares_of_a_sorted_array;
class squares_of_a_sorted_array {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0, j = n - 1, k = n - 1; i <= j;) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                res[k--] = nums[i] * nums[i];
                ++i;
            } else {
                res[k--] = nums[j] * nums[j];
                --j;
            }
        }
        return res;
    }
}
