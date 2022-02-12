package com.neil.javaleetcode.q0900_0999.q0933_number_of_recent_calls;

import java.util.*;




class number_of_recent_calls {

    private Deque<Integer> q;

    public number_of_recent_calls() {
        q = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        q.offerLast(t);
        while (q.peekFirst() < t - 3000) {
            q.pollFirst();
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
