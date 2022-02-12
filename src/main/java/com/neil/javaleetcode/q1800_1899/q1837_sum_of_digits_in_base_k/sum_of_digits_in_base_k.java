package com.neil.javaleetcode.q1800_1899.q1837_sum_of_digits_in_base_k;
class sum_of_digits_in_base_k {
    public int sumBase(int n, int k) {
        int res = 0;
        while (n != 0) {
            res += (n % k);
            n /= k;
        }
        return res;
    }
}
