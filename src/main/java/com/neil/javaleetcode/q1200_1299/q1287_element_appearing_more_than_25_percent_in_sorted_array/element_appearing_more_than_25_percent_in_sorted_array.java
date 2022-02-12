package com.neil.javaleetcode.q1200_1299.q1287_element_appearing_more_than_25_percent_in_sorted_array;
class element_appearing_more_than_25_percent_in_sorted_array {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            if (arr[i] == arr[i + (n >> 2)]) {
                return arr[i];
            }
        }
        return 0;
    }
}
