package com.neil.javaleetcode.q0300_0399.q0397_integer_replacement;
class integer_replacement {
    public int integerReplacement(int n) {
        int ans = 0;
        while (n != 1) {
            if ((n & 1) == 0) {
                n >>>= 1;
            } else if (n != 3 && (n & 3) == 3) {
                ++n;
            } else {
                --n;
            }
            ++ans;
        }
        return ans;
    }
}
