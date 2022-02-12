package com.neil.javaleetcode.q0200_0299.q0275_h_index_ii;
class h_index_ii {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0, right = n;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (citations[mid] >= n - mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return n - left;
    }
}
