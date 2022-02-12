package com.neil.javaleetcode.q1100_1199.q1167_minimum_cost_to_connect_sticks;


import java.util.*;



class minimum_cost_to_connect_sticks {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : sticks) {
            pq.offer(s);
        }
        int res = 0;
        while (pq.size() > 1) {
            int val = pq.poll() + pq.poll();
            res += val;
            pq.offer(val);
        }
        return res;
    }
}
