package com.neil.javaleetcode.q1500_1599.q1553_minimum_number_of_days_to_eat_n_oranges;

import java.util.*;



class minimum_number_of_days_to_eat_n_oranges {
    private Map<Integer, Integer> map = new HashMap<>();

    public int minDays(int n) {
        if (n < 2) {
            return n;
        }
        if (!map.containsKey(n)) {
            map.put(n, Math.min(minDays(n / 2) + 1 + n % 2, minDays(n / 3) + 1 + n % 3));
        }
        return map.get(n);
    }
}
