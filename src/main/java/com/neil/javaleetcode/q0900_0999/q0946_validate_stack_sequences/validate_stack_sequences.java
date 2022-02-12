package com.neil.javaleetcode.q0900_0999.q0946_validate_stack_sequences;


import java.util.*;



class validate_stack_sequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stk = new ArrayDeque<>();
        int j = 0, n = popped.length;
        for (int x : pushed) {
            stk.push(x);
            while (!stk.isEmpty() && j < n && stk.peek() == popped[j]) {
                stk.pop();
                ++j;
            }
        }
        return j == n;
    }
}
