package com.neil.javaleetcode.q0000_0099.q0033_search_in_rotated_sorted_array;
class search_in_rotated_sorted_array {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) >>> 1;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) {
                if (nums[mid] >= nums[r] && target < nums[l]) l = mid + 1;
                else r = mid - 1;
            } else {
                if (nums[mid] <= nums[l] && target > nums[r]) r = mid - 1;
                else l = mid + 1;
            }
        }
        return -1;
    }
}
