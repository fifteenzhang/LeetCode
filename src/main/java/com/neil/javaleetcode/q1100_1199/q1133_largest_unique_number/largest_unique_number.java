package com.neil.javaleetcode.q1100_1199.q1133_largest_unique_number;
class largest_unique_number {
    public int largestUniqueNumber(int[] A) {
        int[] counter = new int[1001];
        for (int a : A) {
            ++counter[a];
        }
        for (int i = 1000; i >= 0; --i) {
            if (counter[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}
