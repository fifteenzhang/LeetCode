package com.neil.javaleetcode.q1200_1299.q1237_find_positive_integer_solution_for_a_given_equation;

import java.util.*;



class find_positive_integer_solution_for_a_given_equation {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i <= 1000; ++i) {
            int left = 1, right = 1000;
            while (left < right) {
                int mid = (left + right) >> 1;
                if (customfunction.f(i, mid) >= z) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            if (customfunction.f(i, left) == z) {
                res.add(Arrays.asList(i, left));
            }
        }
        return res;
    }
}
