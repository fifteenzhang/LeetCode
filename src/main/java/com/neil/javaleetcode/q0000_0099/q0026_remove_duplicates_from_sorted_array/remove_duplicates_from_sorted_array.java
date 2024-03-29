package com.neil.javaleetcode.q0000_0099.q0026_remove_duplicates_from_sorted_array;
class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (i < 1 || num != nums[i - 1]) {
                nums[i++] = num;
            }
        }
        return i;
    }
}
