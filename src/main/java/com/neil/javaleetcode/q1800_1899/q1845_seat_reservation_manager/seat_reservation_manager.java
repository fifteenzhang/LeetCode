package com.neil.javaleetcode.q1800_1899.q1845_seat_reservation_manager;

import java.util.*;


class seat_reservation_manager {
    private PriorityQueue<Integer> q;

    public seat_reservation_manager(int n) {
        q = new PriorityQueue<>(n);
        for (int i = 1; i <= n; ++i) {
            q.offer(i);
        }
    }
    
    public int reserve() {
        return q.poll();
    }
    
    public void unreserve(int seatNumber) {
        q.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
