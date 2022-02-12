package com.neil.javaleetcode.q0200_0299.q0201_bitwise_and_of_numbers_range;
class bitwise_and_of_numbers_range {
    public int rangeBitwiseAnd(int m, int n) {
        while (m < n) {
            n &= n - 1;
        }
        return n;
    }
}
