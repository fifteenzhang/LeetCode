package com.neil.javaleetcode.q0300_0399.q0371_sum_of_two_integers;
class sum_of_two_integers {
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }
}
