package com.neil.javaleetcode.q0900_0999.q0922_sort_array_by_parity_ii;
class sort_array_by_parity_ii {
    public int[] sortArrayByParityII(int[] nums) {
        for (int i = 0, j = 1; i < nums.length; i += 2) {
            if ((nums[i] & 1) == 1) {
                while ((nums[j] & 1) == 1) {
                    j += 2;
                }
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        return nums;
    }
}
