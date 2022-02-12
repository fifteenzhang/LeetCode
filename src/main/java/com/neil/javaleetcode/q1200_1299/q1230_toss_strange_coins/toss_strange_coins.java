package com.neil.javaleetcode.q1200_1299.q1230_toss_strange_coins;
class toss_strange_coins {
    public double probabilityOfHeads(double[] prob, int target) {
        double[] dp = new double[target + 1];
        dp[0] = 1;
        for (double v : prob) {
            for (int j = target; j >= 0; --j) {
                dp[j] *= (1 - v);
                if (j >= 1) {
                    dp[j] += dp[j - 1] * v;
                }
            }
        }
        return dp[target];
    }
}
