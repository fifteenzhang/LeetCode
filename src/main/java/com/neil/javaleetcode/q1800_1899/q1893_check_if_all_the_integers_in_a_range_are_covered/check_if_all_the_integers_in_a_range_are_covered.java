package com.neil.javaleetcode.q1800_1899.q1893_check_if_all_the_integers_in_a_range_are_covered;
class check_if_all_the_integers_in_a_range_are_covered {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] diff = new int[52];
        for (int[] range : ranges) {
            diff[range[0]]++;
            diff[range[1] + 1]--;
        }
        int cur = 0;
        for (int i = 0; i < 52; i++) {
            cur += diff[i];
            if (left <= i && i <= right && cur == 0) {
                return false;
            }
        }
        return true;
    }
}
