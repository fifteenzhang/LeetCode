package com.neil.javaleetcode.q0200_0299.q0274_h_index;
class h_index {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] cnt = new int[n + 1];
        for (int c : citations) {
            if (c <= n) {
                ++cnt[c];
            } else {
                ++cnt[n];
            }
        }
        int sum = 0;
        for (int i = n; i >= 0; --i) {
            sum += cnt[i];
            if (sum >= i) {
                return i;
            }
        }
        return 0;
    }
}
