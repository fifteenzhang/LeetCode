package com.neil.javaleetcode.q1200_1299.q1295_find_numbers_with_even_number_of_digits;
class find_numbers_with_even_number_of_digits {
    public int findNumbers(int[] nums) {
        int s = 0;
        for (int num : nums) {
            if ((String.valueOf(num).length() & 1) == 0) {
                ++s;
            }
        }
        return s;
    }
}
