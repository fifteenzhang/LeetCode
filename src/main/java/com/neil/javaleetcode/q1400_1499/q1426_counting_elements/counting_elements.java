package com.neil.javaleetcode.q1400_1499.q1426_counting_elements;


import java.util.*;


class counting_elements {
    public int countElements(int[] arr) {
        Set<Integer> s = new HashSet<>();
        for (int num : arr) {
            s.add(num);
        }
        int res = 0;
        for (int num : arr) {
            if (s.contains(num + 1)) {
                ++res;
            }
        }
        return res;
    }
}
