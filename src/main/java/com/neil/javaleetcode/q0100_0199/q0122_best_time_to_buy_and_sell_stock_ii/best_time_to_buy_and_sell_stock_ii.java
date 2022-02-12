package com.neil.javaleetcode.q0100_0199.q0122_best_time_to_buy_and_sell_stock_ii;
class best_time_to_buy_and_sell_stock_ii {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; ++i) {
            int t = prices[i] - prices[i - 1];
            res += Math.max(t, 0);
        }
        return res;
    }
}
