package com.neil.javaleetcode.q1600_1699.q1619_mean_of_array_after_removing_some_elements;


import java.util.*;


class mean_of_array_after_removing_some_elements {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        double s = 0;
        for (int start = (int) (n * 0.05), i = start; i < n - start; ++i) {
            s += arr[i];
        }
        return s / (n * 0.9);
    }
}
