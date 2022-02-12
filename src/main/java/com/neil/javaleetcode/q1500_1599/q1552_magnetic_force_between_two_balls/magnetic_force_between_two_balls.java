package com.neil.javaleetcode.q1500_1599.q1552_magnetic_force_between_two_balls;


import java.util.*;


class magnetic_force_between_two_balls {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left = 1, right = position[position.length - 1];
        while (left < right) {
            int mid = (left + right + 1) >> 1;
            if (check(position, mid, m)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    private boolean check(int[] position, int f, int m) {
        int pre = position[0];
        int cnt = 1;
        for (int i = 1; i < position.length; ++i) {
            if (position[i] - pre >= f) {
                ++cnt;
                pre = position[i];
            }
        }
        return cnt >= m;
    }
}
