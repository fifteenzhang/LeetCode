package com.neil.javaleetcode.q0400_0499.q0495_teemo_attacking;
class teemo_attacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length, res = duration;
        for (int i = 0; i < n - 1; ++i) {
            res += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
        }
        return res;
    }
}
