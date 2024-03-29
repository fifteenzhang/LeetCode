package com.neil.javaleetcode.q1400_1499.q1442_count_triplets_that_can_form_two_arrays_of_equal_xor;
class count_triplets_that_can_form_two_arrays_of_equal_xor {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int[] pre = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            pre[i + 1] = pre[i] ^ arr[i];
        }
        int ans = 0;
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = j; k < n; ++k) {
                    int a = pre[j] ^ pre[i];
                    int b = pre[k + 1] ^ pre[j];
                    if (a == b) {
                        ++ans;
                    }
                }
            }
        }
        return ans;
    }
}
