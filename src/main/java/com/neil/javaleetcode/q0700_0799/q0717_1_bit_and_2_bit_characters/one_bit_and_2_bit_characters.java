package com.neil.javaleetcode.q0700_0799.q0717_1_bit_and_2_bit_characters;
class one_bit_and_2_bit_characters {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0, n = bits.length;
        while (i < n - 1) {
            i += bits[i] + 1;
        }
        return i == n - 1;
    }
}
