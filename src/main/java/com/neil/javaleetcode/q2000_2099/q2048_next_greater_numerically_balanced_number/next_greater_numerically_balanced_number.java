package com.neil.javaleetcode.q2000_2099.q2048_next_greater_numerically_balanced_number;
class next_greater_numerically_balanced_number {
    public int nextBeautifulNumber(int n) {
        for (int i = n + 1; i < 10000000; ++i) {
            if (check(i)) {
                return i;
            }
        }
        return -1;
    }

    private boolean check(int num) {
        int[] counter = new int[10];
        char[] chars = String.valueOf(num).toCharArray();
        for (char c : chars) {
            ++counter[c - '0'];
        }
        for (char c : chars) {
            if (counter[c - '0'] != c - '0') {
                return false;
            }
        }
        return true;
    }
}
