package com.neil.javaleetcode.q1800_1899.q1855_maximum_distance_between_a_pair_of_values;
class maximum_distance_between_a_pair_of_values {
    public int maxDistance(int[] nums1, int[] nums2) {
        int res = 0;
        int m = nums1.length, n = nums2.length;
        for (int i = 0; i < m; ++i) {
            int left = i, right = n - 1;
            while (left < right) {
                int mid = (left + right + 1) >> 1;
                if (nums2[mid] >= nums1[i]) {
                    left = mid;
                } else {
                    right = mid - 1;
                }
            }
            res = Math.max(res, left - i);
        }
        return res;
    }
}
