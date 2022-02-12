package com.neil.javaleetcode.q0500_0599.q0503_next_greater_element_ii;


import java.util.*;



class next_greater_element_ii {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Deque<Integer> stk = new ArrayDeque<>();
        for (int i = 0; i < (n << 1); ++i) {
            while (!stk.isEmpty() && nums[stk.peek()] < nums[i % n]) {
                res[stk.pop()] = nums[i % n];
            }
            stk.push(i % n);
        }
        return res;
    }
}
