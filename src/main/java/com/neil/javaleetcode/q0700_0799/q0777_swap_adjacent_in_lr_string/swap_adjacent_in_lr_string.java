package com.neil.javaleetcode.q0700_0799.q0777_swap_adjacent_in_lr_string;
class swap_adjacent_in_lr_string {
    public boolean canTransform(String start, String end) {
        if (start.length() != end.length()) {
            return false;
        }
        int i = 0, j = 0;
        while (true) {
            while (i < start.length() && start.charAt(i) == 'X') {
                ++i;
            }
            while (j < end.length() && end.charAt(j) == 'X') {
                ++j;
            }
            if (i == start.length() && j == start.length()) {
                return true;
            }
            if (i == start.length() || j == start.length() || start.charAt(i) != end.charAt(j)) {
                return false;
            }
            if (start.charAt(i) == 'L' && i < j || start.charAt(i) == 'R'  && i > j) {
                return false;
            }
            ++i;
            ++j;
        }
    }
}
