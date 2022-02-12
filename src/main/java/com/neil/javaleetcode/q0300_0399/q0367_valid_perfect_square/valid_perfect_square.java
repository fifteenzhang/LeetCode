package com.neil.javaleetcode.q0300_0399.q0367_valid_perfect_square;
class valid_perfect_square {
    public boolean isPerfectSquare(int num) {
        long left = 1, right = num;
        while (left < right) {
            long mid = (left + right) >>> 1;
            if (mid * mid >= num) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left * left == num;
    }
}
