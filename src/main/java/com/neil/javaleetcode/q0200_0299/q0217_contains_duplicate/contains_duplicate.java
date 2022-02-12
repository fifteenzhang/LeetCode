package com.neil.javaleetcode.q0200_0299.q0217_contains_duplicate;


import java.util.*;



class contains_duplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            if (s.contains(num)) {
                return true;
            }
            s.add(num);
        }
        return false;
    }
}
