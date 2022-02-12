package com.neil.javaleetcode.q1600_1699.q1672_richest_customer_wealth;
class richest_customer_wealth {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int[] account : accounts) {
            int t = 0;
            for (int money : account) {
                t += money;
            }
            res = Math.max(res, t);
        }
        return res;
    }
}
