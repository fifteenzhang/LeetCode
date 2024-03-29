package com.neil.javaleetcode.q0300_0399.q0370_range_addition;
class range_addition {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] delta = new int[length];
        for (int[] e : updates) {
            delta[e[0]] += e[2];
            if (e[1] + 1 < length) {
                delta[e[1] + 1] -= e[2];
            }
        }
        for (int i = 1; i < length; ++i) {
            delta[i] += delta[i - 1];
        }
        return delta;
    }
}
