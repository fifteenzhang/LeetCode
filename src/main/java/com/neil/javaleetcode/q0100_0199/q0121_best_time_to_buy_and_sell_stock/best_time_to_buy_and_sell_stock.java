package com.neil.javaleetcode.q0100_0199.q0121_best_time_to_buy_and_sell_stock;
class best_time_to_buy_and_sell_stock {
    public int maxProfit(int[] prices) {
        int res = 0, mi = prices[0];
        for (int i = 1; i < prices.length; ++i) {
            res = Math.max(res, prices[i] - mi);
            mi = Math.min(mi, prices[i]);
        }
        return res;
    }
}
