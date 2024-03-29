package com.neil.javaleetcode.q0800_0899.q0883_projection_area_of_3d_shapes;
class projection_area_of_3d_shapes {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int res = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                res += grid[i][j] > 0 ? 1 : 0;
            }
        }
        for (int i = 0; i < n; ++i) {
            int max = 0;
            for (int j = 0; j < n; ++j) {
                max = Math.max(max, grid[i][j]);
            }
            res += max;
        }
        for (int j = 0; j < n; ++j) {
            int max = 0;
            for (int i = 0; i < n; ++i) {
                max = Math.max(max, grid[i][j]);
            }
            res += max;
        }
        return res;
    }
}
