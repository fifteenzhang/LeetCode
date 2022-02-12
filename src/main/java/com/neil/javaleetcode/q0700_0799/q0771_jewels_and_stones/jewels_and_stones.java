package com.neil.javaleetcode.q0700_0799.q0771_jewels_and_stones;


import java.util.*;



class jewels_and_stones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> s = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            s.add(c);
        }
        int res = 0;
        for (char c : stones.toCharArray()) {
            res += (s.contains(c) ? 1 : 0);
        }
        return res;
    }
}
