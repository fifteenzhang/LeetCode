package com.neil.javaleetcode.q1200_1299.q1281_subtract_the_product_and_sum_of_digits_of_an_integer;
class subtract_the_product_and_sum_of_digits_of_an_integer {
    public int subtractProductAndSum(int n) {
        int s = 0, p = 1;
        while (n != 0) {
            int t = n % 10;
            n /= 10;
            s += t;
            p *= t;
        }
        return p - s;
    }
}
