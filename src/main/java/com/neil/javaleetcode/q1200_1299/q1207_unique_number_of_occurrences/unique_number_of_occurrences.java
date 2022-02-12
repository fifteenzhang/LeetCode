package com.neil.javaleetcode.q1200_1299.q1207_unique_number_of_occurrences;


import java.util.*;


class unique_number_of_occurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int e : arr) {
            counter.put(e, counter.getOrDefault(e, 0) + 1);
        }
        Set<Integer> s = new HashSet<>();
        for (int num : counter.values()) {
            if (s.contains(num)) {
                return false;
            }
            s.add(num);
        }
        return true;
    }
}
