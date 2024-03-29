package com.neil.javaleetcode.q1200_1299.q1213_intersection_of_three_sorted_arrays;


import java.util.*;



class intersection_of_three_sorted_arrays {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> res = new ArrayList<>();
        for (int num : arr1) {
            if (find(arr2, num) && find(arr3, num)) {
                res.add(num);
            }
        }
        return res;
    }

    private boolean find(int[] arr, int val) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (arr[mid] >= val) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return arr[left] == val;
    }
}
