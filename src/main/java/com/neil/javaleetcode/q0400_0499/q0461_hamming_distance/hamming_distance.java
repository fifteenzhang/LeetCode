package com.neil.javaleetcode.q0400_0499.q0461_hamming_distance;
class hamming_distance {
    public int hammingDistance(int x, int y) {
        // return Integer.bitCount(x ^ y);
        int num = x ^ y;
        int count = 0;
        while (num != 0) {
            num &= num - 1;
            count++;
        }
        return count;
    }
}
