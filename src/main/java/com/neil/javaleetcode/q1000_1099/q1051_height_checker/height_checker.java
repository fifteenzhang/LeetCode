package com.neil.javaleetcode.q1000_1099.q1051_height_checker;


import java.util.*;




import java.util.*;


class height_checker {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        int res = 0;
        for (int i = 0; i < heights.length; ++i) {
            if (heights[i] != expected[i]) {
                ++res;
            }
        }
        return res;
    }
}
