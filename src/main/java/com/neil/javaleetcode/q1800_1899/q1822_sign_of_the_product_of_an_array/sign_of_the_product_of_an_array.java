package com.neil.javaleetcode.q1800_1899.q1822_sign_of_the_product_of_an_array;
class sign_of_the_product_of_an_array {
    public int arraySign(int[] nums) {
        int res = 1;
        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) res *= -1;
        }
        return res;
    }
}
