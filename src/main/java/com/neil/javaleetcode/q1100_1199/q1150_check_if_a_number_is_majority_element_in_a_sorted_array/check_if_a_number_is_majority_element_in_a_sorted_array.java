package com.neil.javaleetcode.q1100_1199.q1150_check_if_a_number_is_majority_element_in_a_sorted_array;
class check_if_a_number_is_majority_element_in_a_sorted_array {
    public boolean isMajorityElement(int[] nums, int target) {
        int n = nums.length;
        int left = bsearchLeft(nums, target, 0, n - 1);
        if (left == -1) {
            return false;
        }
        int right = bsearchRight(nums, target, left, n - 1);
        if (right == -1) {
            return false;
        }
        return right - left + 1 > (n >> 1);
    }

    private int bsearchLeft(int[] nums, int target, int left, int right) {
        while (left < right) {
            int mid = (left + right) >> 1;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left] == target ? left : -1;
    }

    private int bsearchRight(int[] nums, int target, int left, int right) {
        while (left < right) {
            int mid = (left + right + 1) >> 1;
            if (nums[mid] <= target) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return nums[left] == target ? left : -1;
    }
}
