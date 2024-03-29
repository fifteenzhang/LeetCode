package com.neil.javaleetcode.q1800_1899.q1870_minimum_speed_to_arrive_on_time;
class minimum_speed_to_arrive_on_time {
    public int minSpeedOnTime(int[] dist, double hour) {
        int left = 1, right = (int) 1e7;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (arriveOnTime(dist, mid, hour)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return arriveOnTime(dist, left, hour) ? left : -1;
    }

    private boolean arriveOnTime(int[] dist, int speed, double hour) {
        double res = 0;
        for (int i = 0; i < dist.length; ++i) {
            double cost = dist[i] * 1.0 / speed;
            res += (i == dist.length - 1 ? cost : Math.ceil(cost));
        }
        return res <= hour;
    }
}
