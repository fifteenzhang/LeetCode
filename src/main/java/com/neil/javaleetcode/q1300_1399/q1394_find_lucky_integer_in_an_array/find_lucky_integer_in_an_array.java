package com.neil.javaleetcode.q1300_1399.q1394_find_lucky_integer_in_an_array;


import java.util.*;



class find_lucky_integer_in_an_array {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        int ans = -1;
        for (int num : arr) {
            if (num == mp.get(num) && ans < num) {
                ans = num;
            }
        }
        return ans;
    }
}
