package com.neil.javaleetcode.q1400_1499.q1461_check_if_a_string_contains_all_binary_codes_of_size_k;


import java.util.*;


class check_if_a_string_contains_all_binary_codes_of_size_k {
    public boolean hasAllCodes(String s, int k) {
        int counter = 1 << k;
        Set<String> exists = new HashSet<>();
        for (int i = k; i <= s.length(); ++i) {
            String t = s.substring(i - k, i);
            if (!exists.contains(t)) {
                exists.add(t);
                --counter;
            }
            if (counter == 0) {
                return true;
            }
        }
        return false;
    }
}
