package com.neil.javaleetcode.q1900_1999.q1996_the_number_of_weak_characters_in_the_game;


import java.util.*;



class the_number_of_weak_characters_in_the_game {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a, b) -> {
            return a[0] == b[0] ? a[1] - b[1] : b[0] - a[0];
        });
        int ans = 0, mx = 0;
        for (int[] p : properties) {
            if (mx > p[1]) {
                ++ans;
            }
            mx = Math.max(mx, p[1]);
        }
        return ans;
    }
}
