package com.neil.javaleetcode.q0200_0299.q0255_verify_preorder_sequence_in_binary_search_tree;


import java.util.*;


class verify_preorder_sequence_in_binary_search_tree {
    public boolean verifyPreorder(int[] preorder) {
        Deque<Integer> stk = new ArrayDeque<>();
        int last = Integer.MIN_VALUE;
        for (int x : preorder) {
            if (x < last) {
                return false;
            }
            while (!stk.isEmpty() && stk.peek() < x) {
                last = stk.poll();
            }
            stk.push(x);
        }
        return true;
    }
}
