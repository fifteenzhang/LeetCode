package com.neil.javaleetcode.q1800_1899.q1833_maximum_ice_cream_bars;


import java.util.*;



class maximum_ice_cream_bars {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ans = 0, n = costs.length;
        for (int i = 0; i < n && coins >= costs[i]; i++) {
            ans++;
            coins -= costs[i];
        }
        return ans;
    }
}
