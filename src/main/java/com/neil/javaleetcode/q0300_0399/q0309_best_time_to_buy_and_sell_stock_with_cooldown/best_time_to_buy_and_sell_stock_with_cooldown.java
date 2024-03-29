package com.neil.javaleetcode.q0300_0399.q0309_best_time_to_buy_and_sell_stock_with_cooldown;
class best_time_to_buy_and_sell_stock_with_cooldown {
    public int maxProfit(int[] prices) {
        int f1 = -prices[0], f2 = 0, f3 = 0;
        for (int i = 1; i < prices.length; ++i) {
            int pf1 = f1, pf2 = f2, pf3 = f3;
            f1 = Math.max(pf1, pf3 - prices[i]);
            f2 = Math.max(pf2, pf1 + prices[i]);
            f3 = Math.max(pf3, pf2);
        }
        return f2;
    }
}
