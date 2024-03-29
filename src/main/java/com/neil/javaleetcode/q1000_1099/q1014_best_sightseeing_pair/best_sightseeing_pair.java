package com.neil.javaleetcode.q1000_1099.q1014_best_sightseeing_pair;
class best_sightseeing_pair {
    public int maxScoreSightseeingPair(int[] values) {
        int res = 0, mx = values[0];
        for (int i = 1; i < values.length; ++i) {
            res = Math.max(res, values[i] - i + mx);
            mx = Math.max(mx, values[i] + i);
        }
        return res;
    }
}
