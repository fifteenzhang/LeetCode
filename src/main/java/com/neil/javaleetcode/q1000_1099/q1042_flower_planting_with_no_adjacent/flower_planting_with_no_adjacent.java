package com.neil.javaleetcode.q1000_1099.q1042_flower_planting_with_no_adjacent;


import java.util.*;



class flower_planting_with_no_adjacent {
    public int[] gardenNoAdj(int n, int[][] paths) {
        List<Integer>[] g = new List[n];
        for (int i = 0; i < n; ++i) {
            g[i] = new ArrayList<>();
        }
        for (int[] p : paths) {
            int x = p[0] - 1, y = p[1] - 1;
            g[x].add(y);
            g[y].add(x);
        }
        int[] ans = new int[n];
        for (int u = 0; u < n; ++u) {
            Set<Integer> colors = new HashSet<>();
            for (int v : g[u]) {
                colors.add(ans[v]);
            }
            for (int c = 1; c < 5; ++c) {
                if (!colors.contains(c)) {
                    ans[u] = c;
                    break;
                }
            }
        }
        return ans;
    }
}
