package com.neil.javaleetcode.q1900_1999.q1925_count_square_sum_triples;
class count_square_sum_triples {
    public int countTriples(int n) {
        int res = 0;
        for (int a = 1; a <= n; ++a) {
            for (int b = 1; b <= n; ++b) {
                int t = a * a + b * b;
                int c = (int) Math.sqrt(t);
                if (c <= n && c * c == t) {
                    ++res;
                }
            }
        }
        return res;
    }
}
