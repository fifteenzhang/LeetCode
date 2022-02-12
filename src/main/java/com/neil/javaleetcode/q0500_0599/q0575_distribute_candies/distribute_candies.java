package com.neil.javaleetcode.q0500_0599.q0575_distribute_candies;


import java.util.*;


class distribute_candies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> s = new HashSet<>();
        for (int c : candyType) {
            s.add(c);
        }
        return Math.min(candyType.length >> 1, s.size());
    }
}
