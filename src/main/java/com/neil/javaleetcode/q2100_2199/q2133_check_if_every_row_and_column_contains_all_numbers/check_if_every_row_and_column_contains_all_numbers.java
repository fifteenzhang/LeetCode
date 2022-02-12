package com.neil.javaleetcode.q2100_2199.q2133_check_if_every_row_and_column_contains_all_numbers;
class check_if_every_row_and_column_contains_all_numbers {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; ++i) {
            boolean[] seen = new boolean[n];
            for (int j = 0; j < n; ++j) {
                int v = matrix[i][j] - 1;
                if (seen[v]) {
                    return false;
                }
                seen[v] = true;
            }
        }
        for (int j = 0; j < n; ++j) {
            boolean[] seen = new boolean[n];
            for (int i = 0; i < n; ++i) {
                int v = matrix[i][j] - 1;
                if (seen[v]) {
                    return false;
                }
                seen[v] = true;
            }
        }
        return true;
    }
}
