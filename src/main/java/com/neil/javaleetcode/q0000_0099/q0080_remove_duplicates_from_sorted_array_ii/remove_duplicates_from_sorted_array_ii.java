package com.neil.javaleetcode.q0000_0099.q0080_remove_duplicates_from_sorted_array_ii;
class remove_duplicates_from_sorted_array_ii {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (i < 2 || num != nums[i - 2]) {
                nums[i++] = num;
            }
        }
        return i;
    }
}
