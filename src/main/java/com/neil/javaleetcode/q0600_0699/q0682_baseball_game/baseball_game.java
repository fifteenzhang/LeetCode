package com.neil.javaleetcode.q0600_0699.q0682_baseball_game;


import java.util.*;


class baseball_game {
    public int calPoints(String[] ops) {
        Deque<Integer> stk = new ArrayDeque<>();
        for (String op : ops) {
            if ("+".equals(op)) {
                int a = stk.pop();
                int b = stk.peek();
                stk.push(a);
                stk.push(a + b);
            } else if ("D".equals(op)) {
                stk.push(stk.peek() << 1);
            } else if ("C".equals(op)) {
                stk.pop();
            } else {
                stk.push(Integer.valueOf(op));
            }
        }
        return stk.stream().mapToInt(Integer::intValue).sum();
    }
}
