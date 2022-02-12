package com.neil.javaleetcode.q1500_1599.q1502_can_make_arithmetic_progression_from_sequence;


import java.util.*;



class can_make_arithmetic_progression_from_sequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length - 1; ++i) {
            if ((arr[i] << 1) != arr[i - 1] + arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
