package com.neil.javaleetcode.q0100_0199.q0191_number_of_1_bits;
public class number_of_1_bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            n &= (n - 1);
            ++res;
        }
        return res;
    }
}
