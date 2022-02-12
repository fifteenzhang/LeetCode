package com.neil.javaleetcode.q1700_1799.q1798_maximum_number_of_consecutive_values_you_can_make;


import java.util.*;


class maximum_number_of_consecutive_values_you_can_make {
    public int getMaximumConsecutive(int[] coins) {
        int res = 1;
        Arrays.sort(coins);
        for (int coin : coins) {
            if (coin > res) {
                break;
            }
            res += coin;
        }
        return res;
    }
}
