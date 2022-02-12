package com.neil.javaleetcode.q1500_1599.q1572_matrix_diagonal_sum;
class matrix_diagonal_sum {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int res = 0;
        for (int i = 0; i < n; ++i) {
            res += mat[i][i] + (n - i - 1 == i ? 0 : mat[i][n - i - 1]);
        }
        return res;
    }
}
