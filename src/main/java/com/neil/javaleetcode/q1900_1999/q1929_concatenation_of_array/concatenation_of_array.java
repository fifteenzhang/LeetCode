package com.neil.javaleetcode.q1900_1999.q1929_concatenation_of_array;
class concatenation_of_array {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n << 1];
        for (int i = 0; i < n << 1; ++i) {
            ans[i] = nums[i % n];
        }
        return ans;
    }
}
