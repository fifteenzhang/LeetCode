package com.neil.javaleetcode.q0800_0899.q0892_surface_area_of_3d_shapes;
class surface_area_of_3d_shapes {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int res = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] > 0) {
                    res += 2 + grid[i][j] * 4;
                    if (i > 0) {
                        res -= Math.min(grid[i][j], grid[i - 1][j]) * 2;
                    }
                    if (j > 0) {
                        res -= Math.min(grid[i][j], grid[i][j - 1]) * 2;
                    }
                }
            }
        }
        return res;
    }
}
