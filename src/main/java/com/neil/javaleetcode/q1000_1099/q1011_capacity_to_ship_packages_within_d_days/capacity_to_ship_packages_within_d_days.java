package com.neil.javaleetcode.q1000_1099.q1011_capacity_to_ship_packages_within_d_days;
class capacity_to_ship_packages_within_d_days {
    public int shipWithinDays(int[] weights, int days) {
        int left = 1, right = Integer.MAX_VALUE;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (canCarry(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


    public boolean canCarry(int[] weights, int days, int carry) {
        int useDay = 1;
        int curCarry = 0;
        for (int weight : weights) {
            if (weight > carry) {
                return false;
            }
            if ((carry - curCarry) >= weight) {
                curCarry += weight;
            } else {
                curCarry = weight;
                useDay++;
            }
        }
        return useDay <= days;
    }
}
