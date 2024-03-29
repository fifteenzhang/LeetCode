package com.neil.javaleetcode.q1000_1099.q1046_last_stone_weight;


import java.util.*;


class last_stone_weight {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : stones) {
            queue.offer(stone);
        }
        while (queue.size() > 1) {
            int x = queue.poll();
            int y = queue.poll();
            if (x != y) {
                queue.offer(x - y);
            }
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }
}
