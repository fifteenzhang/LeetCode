package com.neil.javaleetcode.q1500_1599.q1561_maximum_number_of_coins_you_can_get;


import java.util.*;



class maximum_number_of_coins_you_can_get {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int start = 0, end = piles.length - 1, ans = 0;
        while (start < end) {
            ans += piles[end - 1];
            start++;
            end -= 2;
        }
        return ans;
    }
}
