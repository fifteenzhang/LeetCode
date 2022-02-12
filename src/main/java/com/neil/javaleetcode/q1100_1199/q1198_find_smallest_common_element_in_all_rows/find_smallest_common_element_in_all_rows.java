package com.neil.javaleetcode.q1100_1199.q1198_find_smallest_common_element_in_all_rows;
class find_smallest_common_element_in_all_rows {
    public int smallestCommonElement(int[][] mat) {
        int[] counter = new int[10001];
        for (int[] row : mat) {
            for (int num : row) {
                ++counter[num];
                if (counter[num] == mat.length) {
                    return num;
                }
            }
        }
        return -1;
    }
}
