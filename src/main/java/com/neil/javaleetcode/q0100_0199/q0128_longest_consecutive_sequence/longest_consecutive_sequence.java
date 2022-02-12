package com.neil.javaleetcode.q0100_0199.q0128_longest_consecutive_sequence;


import java.util.*;



class longest_consecutive_sequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            s.add(num);
        }
        int res = 0;
        for (int num : nums) {
            if (!s.contains(num - 1)) {
                int t = 1, next = num + 1;
                while (s.contains(next++)) {
                    ++t;
                }
                res = Math.max(res, t);
            }
        }
        return res;
    }
}
