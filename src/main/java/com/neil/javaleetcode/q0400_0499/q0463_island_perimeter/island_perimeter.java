package com.neil.javaleetcode.q0400_0499.q0463_island_perimeter;
class island_perimeter {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    ans += 4;
                    if (i < m - 1 && grid[i + 1][j] == 1) {
                        ans -= 2;
                    }
                    if (j < n - 1 && grid[i][j + 1] == 1) {
                        ans -= 2;
                    }
                }
            }
        }
        return ans;
    }
}
