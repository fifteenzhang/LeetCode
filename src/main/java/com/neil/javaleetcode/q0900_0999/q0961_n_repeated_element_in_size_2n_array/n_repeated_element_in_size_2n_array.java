package com.neil.javaleetcode.q0900_0999.q0961_n_repeated_element_in_size_2n_array;

import java.util.HashSet;
import java.util.Set;

class n_repeated_element_in_size_2n_array {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            if (s.contains(num)) {
                return num;
            }
            s.add(num);
        }
        return -1;
    }
}
