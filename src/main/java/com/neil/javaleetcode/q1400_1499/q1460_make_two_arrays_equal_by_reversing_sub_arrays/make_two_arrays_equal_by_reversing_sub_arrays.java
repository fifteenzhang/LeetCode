package com.neil.javaleetcode.q1400_1499.q1460_make_two_arrays_equal_by_reversing_sub_arrays;

import java.util.Arrays;

class make_two_arrays_equal_by_reversing_sub_arrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }
}
