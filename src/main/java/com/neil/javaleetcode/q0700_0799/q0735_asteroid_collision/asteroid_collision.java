package com.neil.javaleetcode.q0700_0799.q0735_asteroid_collision;


import java.util.*;


class asteroid_collision {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> d = new ArrayDeque<>();
        for (int a : asteroids) {
            if (a > 0) {
                d.offerLast(a);
            } else {
                while (!d.isEmpty() && d.peekLast() > 0 && d.peekLast() < -a) {
                    d.pollLast();
                }
                if (!d.isEmpty() && d.peekLast() == -a) {
                    d.pollLast();
                } else if (d.isEmpty() || d.peekLast() < -a) {
                    d.offerLast(a);
                }
            }
        }
        return d.stream().mapToInt(Integer::valueOf).toArray();
    }
}
