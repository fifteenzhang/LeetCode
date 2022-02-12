package com.neil.javaleetcode.q0900_0999.q0997_find_the_town_judge;
class find_the_town_judge {
    public int findJudge(int n, int[][] trust) {
        int N = 1001;
        int[] c1 = new int[N];
        int[] c2 = new int[N];
        for (int[] e : trust) {
            ++c1[e[0]];
            ++c2[e[1]];
        }
        for (int i = 1; i < N; ++i) {
            if (c1[i] == 0 && c2[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}
