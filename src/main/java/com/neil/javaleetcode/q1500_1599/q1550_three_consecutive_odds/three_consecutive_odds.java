package com.neil.javaleetcode.q1500_1599.q1550_three_consecutive_odds;
class three_consecutive_odds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int n : arr) {
            if (n % 2 == 0) {
                count = 0;
            } else {
                count++;
                if (count >= 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
