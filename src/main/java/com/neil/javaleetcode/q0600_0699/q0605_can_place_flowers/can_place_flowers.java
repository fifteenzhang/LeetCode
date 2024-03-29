package com.neil.javaleetcode.q0600_0699.q0605_can_place_flowers;
class can_place_flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int cnt = 0;
        for (int i = 0; i < len; ++i) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == len - 1 || flowerbed[i + 1] == 0)) {
                ++cnt;
                flowerbed[i] = 1;
            }
        }
        return cnt >= n;
    }
}
