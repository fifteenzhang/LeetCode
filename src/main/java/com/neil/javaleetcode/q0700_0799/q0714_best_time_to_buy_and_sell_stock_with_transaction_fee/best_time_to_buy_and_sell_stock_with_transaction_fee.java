package com.neil.javaleetcode.q0700_0799.q0714_best_time_to_buy_and_sell_stock_with_transaction_fee;
class best_time_to_buy_and_sell_stock_with_transaction_fee {
    public int maxProfit(int[] prices, int fee) {
        int f1 = -prices[0], f2 = 0;
        for (int i = 1; i < prices.length; ++i) {
            f1 = Math.max(f1, f2 - prices[i]);
            f2 = Math.max(f2, f1 + prices[i] - fee);
        }
        return f2;
    }
}
