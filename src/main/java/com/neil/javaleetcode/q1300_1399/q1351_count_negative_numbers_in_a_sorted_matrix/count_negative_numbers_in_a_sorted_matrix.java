package com.neil.javaleetcode.q1300_1399.q1351_count_negative_numbers_in_a_sorted_matrix;
class count_negative_numbers_in_a_sorted_matrix {
    public int countNegatives(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int cnt = 0;
        for (int i = 0, j = n - 1; j >= 0 && i < m;) {
            if (grid[i][j] < 0) {
                cnt += (m - i);
                --j;
            } else {
                ++i;
            }
        }
        return cnt;
    }
}
