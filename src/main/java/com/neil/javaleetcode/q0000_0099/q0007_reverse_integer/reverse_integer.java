package com.neil.javaleetcode.q0000_0099.q0007_reverse_integer;
class reverse_integer {
    public int reverse(int x) {
        long res = 0;
        // 考虑负数情况，所以这里条件为: x != 0
        while (x != 0) {
            res = res * 10 + (x % 10);
            x /= 10;
        }
        return res < Integer.MIN_VALUE || res > Integer.MAX_VALUE ? 0 : (int) res;
    }
}
