package com.neil.javaleetcode.q0900_0999.q0947_most_stones_removed_with_same_row_or_column;


import java.util.*;



class most_stones_removed_with_same_row_or_column {
    private int[] p;

    public int removeStones(int[][] stones) {
        int n = 10010;
        p = new int[n << 1];
        for (int i = 0; i < p.length; ++i) {
            p[i] = i;
        }
        for (int[] e : stones) {
            p[find(e[0])] = find(e[1] + n);
        }
        Set<Integer> s = new HashSet<>();
        for (int[] e : stones) {
            s.add(find(e[0]));
        }
        return stones.length - s.size();
    }

    private int find(int x) {
        if (p[x] != x) {
            p[x] = find(p[x]);
        }
        return p[x];
    }
}
