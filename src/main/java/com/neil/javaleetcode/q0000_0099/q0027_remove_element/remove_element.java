package com.neil.javaleetcode.q0000_0099.q0027_remove_element;
class remove_element {
    public int removeElement(int[] nums, int val) {
        int cnt = 0, n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == val) ++cnt;
            else nums[i - cnt] = nums[i];
        }
        return n - cnt;
    }
}
