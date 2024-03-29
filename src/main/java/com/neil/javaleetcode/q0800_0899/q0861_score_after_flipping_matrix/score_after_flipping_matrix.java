package com.neil.javaleetcode.q0800_0899.q0861_score_after_flipping_matrix;
class score_after_flipping_matrix {
    public int matrixScore(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; ++i) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < n; ++j) {
                    grid[i][j] ^= 1;
                }
            }
        }
        int res = 0;
        for (int j = 0; j < n; ++j) {
            int cnt = 0;
            for (int i = 0; i < m; ++i) {
                cnt += grid[i][j];
            }
            res += Math.max(cnt, m - cnt) * (1 << (n - j - 1));
        }
        return res;
    }
}
