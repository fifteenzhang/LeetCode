package com.neil.javaleetcode.q2100_2199.q2148_count_elements_with_strictly_smaller_and_greater_elements;
class count_elements_with_strictly_smaller_and_greater_elements {
    public int countElements(int[] nums) {
        int mi = 1000000, mx = -1000000;
        for (int num : nums) {
            mi = Math.min(mi, num);
            mx = Math.max(mx, num);
        }
        int ans = 0;
        for (int num : nums) {
            if (mi < num && num < mx) {
                ++ans;
            }
        }
        return ans;
    }
}
