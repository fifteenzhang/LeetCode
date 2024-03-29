package com.neil.javaleetcode.q1000_1099.q1010_pairs_of_songs_with_total_durations_divisible_by_60;



import java.util.*;


class pairs_of_songs_with_total_durations_divisible_by_60 {
    public int numPairsDivisibleBy60(int[] time) {
        Arrays.sort(time);
        int ans = 0;
        for (int i = 0; i < time.length - 1; i++) {
            int num = (time[i] + time[time.length - 1]) / 60;

            while (num > 0) {
                int key = num * 60;
                int index = Arrays.binarySearch(time, i + 1, time.length, key - time[i]);
                if (index >= 0) {
                    int temp = index;
                    ans++;
                    while (++temp < time.length && time[temp] == time[index]) {
                        ans++;
                    }
                    temp = index;
                    while (--temp > i && time[temp] == time[index]) {
                        ans++;
                    }
                }
                num--;
            }
        }
        return ans;
    }
}
