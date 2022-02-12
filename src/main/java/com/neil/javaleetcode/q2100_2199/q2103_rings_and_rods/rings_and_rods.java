package com.neil.javaleetcode.q2100_2199.q2103_rings_and_rods;


import java.util.*;


class rings_and_rods {
    public int countPoints(String rings) {
        Map<Integer, Set<Character>> mp = new HashMap<>();
        for (int i = 1; i < rings.length(); i += 2) {
            int c = rings.charAt(i) - '0';
            mp.computeIfAbsent(c, k -> new HashSet<>()).add(rings.charAt(i - 1));
        }
        int ans = 0;
        for (Set<Character> e : mp.values()) {
            if (e.size() == 3) {
                ++ans;
            }
        }
        return ans;
    }
}
