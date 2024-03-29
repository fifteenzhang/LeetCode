package com.neil.javaleetcode.q0700_0799.q0778_swim_in_rising_water;
class swim_in_rising_water {
    private int[] p;
    private int n;
    private int[][] dirs = new int[][]{{0, -1}, {0, 1}, {1, 0}, {-1, 0}};

    public int swimInWater(int[][] grid) {
        n = grid.length;
        p = new int[n * n];
        for (int i = 0; i < p.length; ++i) {
            p[i] = i;
        }
        int[] hi = new int[n * n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                hi[grid[i][j]] = index(i, j);
            }
        }
        for (int h = 0; h < n * n; ++h) {
            int x = hi[h] / n, y = hi[h] % n;
            for (int[] dir : dirs) {
                int x1 = x + dir[0], y1 = y + dir[1];
                if (check(x1, y1) && grid[x1][y1] <= h) {
                    p[find(index(x1, y1))] = find(hi[h]);
                }
                if (find(0) == find(n * n - 1)) {
                    return h;
                }
            }
        }
        return -1;
    }

    private int find(int x) {
        if (p[x] != x) {
            p[x] = find(p[x]);
        }
        return p[x];
    }

    private int index(int i, int j) {
        return i * n + j;
    }

    private boolean check(int i, int j) {
        return i >= 0 && i < n && j >= 0 && j < n;
    }
}
