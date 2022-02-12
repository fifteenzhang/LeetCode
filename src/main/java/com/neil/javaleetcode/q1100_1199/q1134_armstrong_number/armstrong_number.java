package com.neil.javaleetcode.q1100_1199.q1134_armstrong_number;
class armstrong_number {
    public boolean isArmstrong(int n) {
        int k = String.valueOf(n).length();
        int s = 0, t = n;
        while (t != 0) {
            s += Math.pow(t % 10, k);
            t /= 10;
        }
        return n == s;
    }
}
