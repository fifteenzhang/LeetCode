package com.neil.javaleetcode.q1900_1999.q1940_longest_common_subsequence_between_sorted_arrays;


import java.util.*;



class longest_common_subsequence_between_sorted_arrays {
    public List<Integer> longestCommomSubsequence(int[][] arrays) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int[] array : arrays) {
            for (int e : array) {
                counter.put(e, counter.getOrDefault(e, 0) + 1);
            }
        }
        int n = arrays.length;
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == n) {
                res.add(entry.getKey());
            }
        }
        return res;
    }
}
