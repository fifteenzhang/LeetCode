package com.neil.javaleetcode.q1100_1199.q1122_relative_sort_array;
class relative_sort_array {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] mp = new int[1001];
        for (int x : arr1) {
            ++mp[x];
        }
        int i = 0;
        for (int x : arr2) {
            while (mp[x]-- > 0) {
                arr1[i++] = x;
            }
        }
        for (int j = 0; j < mp.length; ++j) {
            while (mp[j]-- > 0) {
                arr1[i++] = j;
            }
        }
        return arr1;
    }
}
