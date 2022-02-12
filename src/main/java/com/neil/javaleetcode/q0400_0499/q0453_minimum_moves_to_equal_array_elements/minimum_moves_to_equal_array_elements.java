package com.neil.javaleetcode.q0400_0499.q0453_minimum_moves_to_equal_array_elements;


import java.util.*;



class minimum_moves_to_equal_array_elements {
    public int minMoves(int[] nums) {
        return Arrays.stream(nums).sum() - Arrays.stream(nums).min().getAsInt() * nums.length;
    }
}
