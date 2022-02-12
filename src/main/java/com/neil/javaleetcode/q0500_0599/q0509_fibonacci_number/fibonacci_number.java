package com.neil.javaleetcode.q0500_0599.q0509_fibonacci_number;
class fibonacci_number {
    public int fib(int n) {
        int a = 0, b = 1;
        while (n-- > 0) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
}
