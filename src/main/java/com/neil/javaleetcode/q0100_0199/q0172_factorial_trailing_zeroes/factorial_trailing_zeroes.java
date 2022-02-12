package com.neil.javaleetcode.q0100_0199.q0172_factorial_trailing_zeroes;
class factorial_trailing_zeroes {
    public int trailingZeroes(int n) {
        int t = 0;
        while (n >= 5) {
            t += n / 5;
            n /= 5;
        }
        return t;
    }
}
