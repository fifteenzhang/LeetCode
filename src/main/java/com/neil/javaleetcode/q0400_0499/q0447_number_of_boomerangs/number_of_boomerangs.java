package com.neil.javaleetcode.q0400_0499.q0447_number_of_boomerangs;


import java.util.*;


class number_of_boomerangs {
    public int numberOfBoomerangs(int[][] points) {
        int ans = 0;
        for (int[] p : points) {
            Map<Integer, Integer> counter = new HashMap<>();
            for (int[] q : points) {
                int distance = (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1]);
                counter.put(distance, counter.getOrDefault(distance, 0) + 1);
            }
            for (int val : counter.values()) {
                ans += val * (val - 1);
            }
        }
        return ans;
    }
}
