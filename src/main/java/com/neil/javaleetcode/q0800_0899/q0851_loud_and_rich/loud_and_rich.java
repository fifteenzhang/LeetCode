package com.neil.javaleetcode.q0800_0899.q0851_loud_and_rich;


import java.util.*;


class loud_and_rich {
    private Map<Integer, List<Integer>> g;
    private int[] quiet;
    private int[] ans;

    public int[] loudAndRich(int[][] richer, int[] quiet) {
        g = new HashMap<>();
        this.quiet = quiet;
        ans = new int[quiet.length];
        Arrays.fill(ans, -1);
        for (int[] r : richer) {
            g.computeIfAbsent(r[1], k -> new ArrayList<>()).add(r[0]);
        }
        for (int i = 0; i < quiet.length; ++i) {
            dfs(i);
        }
        return ans;
    }

    private void dfs(int i) {
        if (ans[i] != -1) {
            return;
        }
        ans[i] = i;
        if (!g.containsKey(i)) {
            return;
        }
        for (int j : g.get(i)) {
            dfs(j);
            if (quiet[ans[j]] < quiet[ans[i]]) {
                ans[i] = ans[j];
            }
        }
    }
}
