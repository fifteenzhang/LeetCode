package com.neil.javaleetcode.q0000_0099.q0050_pow_x_n;
class pow_x_n {
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? pow(x, N) : 1.0 / pow(x, -N);
    }

    public double pow(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = pow(x, N >> 1);
        return (N & 1) == 0 ? y * y : y * y * x;
    }
}
