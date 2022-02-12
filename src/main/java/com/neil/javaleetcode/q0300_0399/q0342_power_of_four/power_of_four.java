package com.neil.javaleetcode.q0300_0399.q0342_power_of_four;
class power_of_four {
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0;
    }
}
