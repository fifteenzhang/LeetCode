package com.neil.javaleetcode.q1900_1999.q1952_three_divisors;
class three_divisors {
    public boolean isThree(int n) {
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ++cnt;
            }
        }
        return cnt == 1;
    }
}
