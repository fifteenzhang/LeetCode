package com.neil.javaleetcode.q0800_0899.q0829_consecutive_numbers_sum;
class consecutive_numbers_sum {
    public int consecutiveNumbersSum(int N) {
        int res = 0;
        for (int i = 1; i * (i - 1) / 2 < N; ++i) {
            if ((N - i * (i - 1) / 2) % i == 0) {
                ++res;
            }
        }
        return res;
    }
}
