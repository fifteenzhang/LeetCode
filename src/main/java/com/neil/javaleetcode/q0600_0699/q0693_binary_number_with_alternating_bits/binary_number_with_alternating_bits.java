package com.neil.javaleetcode.q0600_0699.q0693_binary_number_with_alternating_bits;
class binary_number_with_alternating_bits {
    public boolean hasAlternatingBits(int n) {
        n = (n ^ (n >> 1)) + 1;
        return (n & (n - 1)) == 0;
    }
}
