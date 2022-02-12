package com.neil.javaleetcode.q0100_0199.q0188_best_time_to_buy_and_sell_stock_iv;
class best_time_to_buy_and_sell_stock_iv {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n <= 1) {
            return 0;
        }
        int[][][] dp = new int[n][k + 1][2];
        for (int i = 1; i <= k; ++i) {
            dp[0][i][1] = -prices[0];
        }
        for (int i = 1; i < n; ++i) {
            for (int j = 1; j <= k; ++j) {
                dp[i][j][0] = Math.max(dp[i - 1][j][1] + prices[i], dp[i - 1][j][0]);
                dp[i][j][1] = Math.max(dp[i - 1][j - 1][0] - prices[i], dp[i - 1][j][1]);
            }
        }
        return dp[n - 1][k][0];
    }
}
