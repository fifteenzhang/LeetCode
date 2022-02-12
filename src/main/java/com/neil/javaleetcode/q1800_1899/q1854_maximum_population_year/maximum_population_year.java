package com.neil.javaleetcode.q1800_1899.q1854_maximum_population_year;
class maximum_population_year {
    public int maximumPopulation(int[][] logs) {
        int[] delta = new int[2055];
        for (int[] log : logs) {
            ++delta[log[0]];
            --delta[log[1]];
        }
        int res = 0, mx = 0, cur = 0;
        for (int i = 0; i < delta.length; ++i) {
            cur += delta[i];
            if (cur > mx) {
                mx = cur;
                res = i;
            }
        }
        return res;
    }
}
