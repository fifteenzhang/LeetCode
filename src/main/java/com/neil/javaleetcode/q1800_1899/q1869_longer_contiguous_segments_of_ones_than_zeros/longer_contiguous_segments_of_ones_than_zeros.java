package com.neil.javaleetcode.q1800_1899.q1869_longer_contiguous_segments_of_ones_than_zeros;
class longer_contiguous_segments_of_ones_than_zeros {
    public boolean checkZeroOnes(String s) {
        int n0 = 0, n1 = 0;
        int t0 = 0, t1 = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '0') {
                ++t0;
                t1 = 0;
            } else {
                ++t1;
                t0 = 0;
            }
            n0 = Math.max(n0, t0);
            n1 = Math.max(n1, t1);
        }
        return n1 > n0;
    }
}
