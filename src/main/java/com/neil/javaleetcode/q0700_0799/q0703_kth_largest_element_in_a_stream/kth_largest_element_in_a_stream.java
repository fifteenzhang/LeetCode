package com.neil.javaleetcode.q0700_0799.q0703_kth_largest_element_in_a_stream;

import java.util.PriorityQueue;

class kth_largest_element_in_a_stream {
    private PriorityQueue<Integer> q;
    private int size;

    public kth_largest_element_in_a_stream(int k, int[] nums) {
        q = new PriorityQueue<>(k);
        size = k;
        for (int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        q.offer(val);
        if (q.size() > size) {
            q.poll();
        }
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
