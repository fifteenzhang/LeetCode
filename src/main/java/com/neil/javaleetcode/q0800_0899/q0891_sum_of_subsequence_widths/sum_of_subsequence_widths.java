package com.neil.javaleetcode.q0800_0899.q0891_sum_of_subsequence_widths;


import java.util.*;



class sum_of_subsequence_widths {
    public int sumSubseqWidths(int[] A) {
        final int MOD = (int) (1e9 + 7);
        Arrays.sort(A);
        int n = A.length;
        long res = 0;
        long p = 1;
        for (int i = 0; i < n; ++i) {
            res = (res + (A[i] - A[n - 1 - i]) * p) % MOD;
            p = (p << 1) % MOD;
        }
        return (int) ((res + MOD) % MOD);
    }
}
