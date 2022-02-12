package com.neil.javaleetcode.q1900_1999.q1991_find_the_middle_index_in_array;
class find_the_middle_index_in_array {
    public int findMiddleIndex(int[] nums) {
        int s = 0;
        for (int num : nums) {
            s += num;
        }
        int total = 0;
        for (int i = 0; i < nums.length; ++i) {
            total += nums[i];
            if (total - nums[i] == s - total) {
                return i;
            }
        }
        return -1;
    }
}
