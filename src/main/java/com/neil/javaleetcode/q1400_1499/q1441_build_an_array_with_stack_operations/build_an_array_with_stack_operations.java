package com.neil.javaleetcode.q1400_1499.q1441_build_an_array_with_stack_operations;


import java.util.*;



class build_an_array_with_stack_operations {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int cur = 1;
        for (int t : target) {
            for (int i = cur; i <= n; ++i) {
                ans.add("Push");
                if (t == i) {
                    cur = i + 1;
                    break;
                }
                ans.add("Pop");
            }
        }
        return ans;
    }
}
