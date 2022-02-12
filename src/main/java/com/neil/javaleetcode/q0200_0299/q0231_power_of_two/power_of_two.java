package com.neil.javaleetcode.q0200_0299.q0231_power_of_two;
class power_of_two {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
