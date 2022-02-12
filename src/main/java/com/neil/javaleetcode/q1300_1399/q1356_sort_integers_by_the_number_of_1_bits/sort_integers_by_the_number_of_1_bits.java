package com.neil.javaleetcode.q1300_1399.q1356_sort_integers_by_the_number_of_1_bits;


import java.util.*;



class sort_integers_by_the_number_of_1_bits {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 100000;
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            arr[i] %= 100000;
        }
        return arr;
    }
}
