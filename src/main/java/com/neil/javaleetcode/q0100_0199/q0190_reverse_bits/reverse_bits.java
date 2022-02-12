package com.neil.javaleetcode.q0100_0199.q0190_reverse_bits;
public class reverse_bits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            res |= ((n & 1) << (31 - i));
            n >>>= 1;
        }
        return res;
    }
}
