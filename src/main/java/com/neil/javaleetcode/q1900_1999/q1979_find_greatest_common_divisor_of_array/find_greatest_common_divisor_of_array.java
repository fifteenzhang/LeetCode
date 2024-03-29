package com.neil.javaleetcode.q1900_1999.q1979_find_greatest_common_divisor_of_array;
class find_greatest_common_divisor_of_array {
    public int findGCD(int[] nums) {
        int a = 1, b = 1000;
        for (int num : nums) {
            a = Math.max(a, num);
            b = Math.min(b, num);
        }
        return gcd(a, b);
    }

    private int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
}
