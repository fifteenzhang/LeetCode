package com.neil.javaleetcode.q0400_0499.q0496_next_greater_element_i;


import java.util.*;



class next_greater_element_i {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stk = new ArrayDeque<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums2) {
            while (!stk.isEmpty() && stk.peek() < num) {
                mp.put(stk.pop(), num);
            }
            stk.push(num);
        }
        int n = nums1.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; ++i) {
            ans[i] = mp.getOrDefault(nums1[i], -1);
        }
        return ans;
    }
}
