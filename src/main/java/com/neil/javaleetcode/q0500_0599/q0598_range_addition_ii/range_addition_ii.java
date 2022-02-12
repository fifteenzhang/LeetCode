package com.neil.javaleetcode.q0500_0599.q0598_range_addition_ii;
class range_addition_ii {
    public int maxCount(int m, int n, int[][] ops) {
        for (int[] op : ops) {
            m = Math.min(m, op[0]);
            n = Math.min(n, op[1]);
        }
        return m * n;
    }
}
