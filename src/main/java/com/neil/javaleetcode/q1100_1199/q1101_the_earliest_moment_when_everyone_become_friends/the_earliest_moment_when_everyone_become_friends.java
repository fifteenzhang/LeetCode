package com.neil.javaleetcode.q1100_1199.q1101_the_earliest_moment_when_everyone_become_friends;


import java.util.*;


class the_earliest_moment_when_everyone_become_friends {
    private int[] p;

    public int earliestAcq(int[][] logs, int n) {
        p = new int[n];
        for (int i = 0; i < n; ++i) {
            p[i] = i;
        }
        Arrays.sort(logs, Comparator.comparingInt(a -> a[0]));
        for (int[] log : logs) {
            int t = log[0];
            int a = log[1], b = log[2];
            int pa = find(a), pb = find(b);
            if (pa == pb) {
                continue;
            }
            p[pa] = pb;
            --n;
            if (n == 1) {
                return t;
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
}
