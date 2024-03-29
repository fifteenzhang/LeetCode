package com.neil.javaleetcode.q0700_0799.q0781_rabbits_in_forest;


import java.util.*;


class rabbits_in_forest {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int e : answers) {
            counter.put(e, counter.getOrDefault(e, 0) + 1);
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            int answer = entry.getKey(), count = entry.getValue();
            res += (int) Math.ceil(count / ((answer + 1) * 1.0)) * (answer + 1);
        }
        return res;
    }
}
