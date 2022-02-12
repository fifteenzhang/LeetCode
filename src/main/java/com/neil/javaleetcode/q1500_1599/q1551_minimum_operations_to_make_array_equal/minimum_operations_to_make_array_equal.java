package com.neil.javaleetcode.q1500_1599.q1551_minimum_operations_to_make_array_equal;
class minimum_operations_to_make_array_equal {
    public int minOperations(int n) {
        int ans = 0;
        for (int i = 0; i < (n >> 1); i++) {
            ans += (n - (2 * i + 1));
        }
        return ans;
    }
}
