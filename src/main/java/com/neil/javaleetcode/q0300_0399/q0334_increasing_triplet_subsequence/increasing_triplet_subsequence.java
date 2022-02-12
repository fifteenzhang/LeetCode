package com.neil.javaleetcode.q0300_0399.q0334_increasing_triplet_subsequence;
class increasing_triplet_subsequence {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE, mid = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > mid) {
                return true;
            }
            if (num <= min) {
                min = num;
            } else {
                mid = num;
            }
        }
        return false;
    }
}
