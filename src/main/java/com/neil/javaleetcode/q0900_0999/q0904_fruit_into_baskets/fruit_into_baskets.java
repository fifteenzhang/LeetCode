package com.neil.javaleetcode.q0900_0999.q0904_fruit_into_baskets;


import java.util.*;


class fruit_into_baskets {
    public int totalFruit(int[] tree) {
        Map<Integer, Integer> counter = new HashMap<>();
        int i = 0, res = 0;
        for (int j = 0; j < tree.length; ++j) {
            counter.put(tree[j], counter.getOrDefault(tree[j], 0) + 1);
            while (counter.size() > 2) {
                counter.put(tree[i], counter.get(tree[i]) - 1);
                if (counter.get(tree[i]) == 0) {
                    counter.remove(tree[i]);
                }
                ++i;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
