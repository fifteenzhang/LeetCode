package com.neil.javaleetcode.q1100_1199.q1137_n_th_tribonacci_number;
class n_th_tribonacci_number {
    public int tribonacci(int n) {
        int a = 0, b = 1, c = 1;
        while (n-- > 0) {
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return a;
    }
}
