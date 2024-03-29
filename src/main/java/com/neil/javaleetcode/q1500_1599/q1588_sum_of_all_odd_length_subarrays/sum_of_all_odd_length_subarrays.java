package com.neil.javaleetcode.q1500_1599.q1588_sum_of_all_odd_length_subarrays;
class sum_of_all_odd_length_subarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int[] presum = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            presum[i + 1] = presum[i] + arr[i];
        }
        int res = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; i + j < n; j += 2) {
                res += presum[i + j + 1] - presum[i];
            }
        }
        return res;
    }
}
