package com.neil.javaleetcode.q0400_0499.q0441_arranging_coins;
class arranging_coins {
    public int arrangeCoins(int n) {
        return (int) (Math.sqrt(2) * Math.sqrt(n + 0.125) - 0.5);
    }
}
