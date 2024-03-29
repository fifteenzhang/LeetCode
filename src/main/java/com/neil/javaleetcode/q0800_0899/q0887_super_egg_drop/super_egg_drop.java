package com.neil.javaleetcode.q0800_0899.q0887_super_egg_drop;



import java.util.*;


class super_egg_drop {
    public int superEggDrop(int K, int N) {
        int[] res = new int[K];
        Arrays.fill(res, 1);
        while (res[K - 1] < N) {
            for (int i = K - 1; i >= 1; i--) {
                res[i] = res[i] + res[i - 1] + 1;
            }
            res[0]++;
        }
        return res[0];
    }
}
