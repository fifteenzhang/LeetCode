package com.neil.javaleetcode.q1500_1599.q1539_kth_missing_positive_number;
class kth_missing_positive_number {
    public int findKthPositive(int[] arr, int k) {
        if (arr[0] > k) {
            return k;
        }
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) >> 1;
            int cur = mid == arr.length ? Integer.MAX_VALUE : arr[mid];
            if (cur - mid - 1 < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return k - (arr[left - 1] - (left - 1) - 1) + arr[left - 1];
    }
}
