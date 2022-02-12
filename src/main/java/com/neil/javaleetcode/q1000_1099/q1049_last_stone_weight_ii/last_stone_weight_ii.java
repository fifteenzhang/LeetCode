package com.neil.javaleetcode.q1000_1099.q1049_last_stone_weight_ii;
class last_stone_weight_ii {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        int n = sum / 2;
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int stone : stones) {
            for (int j = n; j >= stone; j--) {
                dp[j] = dp[j] || dp[j - stone];
            }
        }
        for (int j = n; ; j--) {
            if (dp[j]) {
                return sum - j - j;
            }
        }
    }
}
