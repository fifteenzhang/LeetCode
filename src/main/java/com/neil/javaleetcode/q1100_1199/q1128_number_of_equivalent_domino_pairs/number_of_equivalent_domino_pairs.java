package com.neil.javaleetcode.q1100_1199.q1128_number_of_equivalent_domino_pairs;


import java.util.*;



class number_of_equivalent_domino_pairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] d : dominoes) {
            int x = d[0] < d[1] ? d[0] * 10 + d[1] : d[1] * 10 + d[0];
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int res = 0;
        for (int v : map.values()) {
            res += v * (v - 1) / 2;
        }
        return res;
    }
}
