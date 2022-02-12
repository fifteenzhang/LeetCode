package com.neil.javaleetcode.q1900_1999.q1936_add_minimum_number_of_rungs;
class add_minimum_number_of_rungs {
    public int addRungs(int[] rungs, int dist) {
        int res = 0;
        for (int i = 0, prev = 0; i < rungs.length; ++i) {
            res += (rungs[i] - prev - 1) / dist;
            prev = rungs[i];
        }
        return res;
    }
}
