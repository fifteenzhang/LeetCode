package com.neil.javaleetcode.q2100_2199.q2144_minimum_cost_of_buying_candies_with_discount;


import java.util.*;


class minimum_cost_of_buying_candies_with_discount {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans = 0, n = cost.length;
        for (int i = n - 1; i >= 0; i -= 3) {
            ans += cost[i];
            if (i >= 1) {
                ans += cost[i - 1];
            }
        }
        return ans;
    }
}
