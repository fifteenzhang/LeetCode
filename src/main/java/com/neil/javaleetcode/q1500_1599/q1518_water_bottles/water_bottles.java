package com.neil.javaleetcode.q1500_1599.q1518_water_bottles;
class water_bottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while (numBottles >= numExchange) {
            numBottles -= (numExchange - 1);
            ++ans;
        }
        return ans;
    }
}
