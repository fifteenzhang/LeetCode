package com.neil.javaleetcode.q1200_1299.q1202_smallest_string_with_swaps;


import java.util.*;



class smallest_string_with_swaps {
    private int[] p;

    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        p = new int[n];
        for (int i = 0; i < n; ++i) {
            p[i] = i;
        }
        for (List<Integer> pair : pairs) {
            p[find(pair.get(0))] = find(pair.get(1));
        }
        Map<Integer, PriorityQueue<Character>> mp = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < n; ++i) {
            mp.computeIfAbsent(find(i), key -> new PriorityQueue<>()).offer(chars[i]);
        }
        for (int i = 0; i < n; ++i) {
            chars[i] = mp.get(find(i)).poll();
        }
        return new String(chars);
    }

    private int find(int x) {
        if (p[x] != x) {
            p[x] = find(p[x]);
        }
        return p[x];
    }
}
