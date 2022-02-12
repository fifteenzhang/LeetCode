package com.neil.javaleetcode.q0500_0599.q0519_random_flip_matrix;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class random_flip_matrix {
    private int m;
    private int n;
    private int total;
    private Random rand = new Random();
    private Map<Integer, Integer> mp = new HashMap<>();

    public random_flip_matrix(int m, int n) {
        this.m = m;
        this.n = n;
        this.total = m * n;
    }
    
    public int[] flip() {
        int x = rand.nextInt(total--);
        int idx = mp.getOrDefault(x, x);
        mp.put(x, mp.getOrDefault(total, total));
        return new int[]{idx / n, idx % n};
    }
    
    public void reset() {
        total = m * n;
        mp.clear();
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(m, n);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */
