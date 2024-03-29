package com.neil.javaleetcode.q0500_0599.q0540_single_element_in_a_sorted_array;
class single_element_in_a_sorted_array {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if ((mid & 1) == 1) {
                --mid;
            }
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
