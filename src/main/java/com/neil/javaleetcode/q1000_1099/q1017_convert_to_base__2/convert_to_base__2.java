package com.neil.javaleetcode.q1000_1099.q1017_convert_to_base__2;
class convert_to_base__2 {
    public String baseNeg2(int N) {
        if (N == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (N != 0) {
            sb.append(N & 1);
            N = -(N >> 1);
        }
        return sb.reverse().toString();
    }
}
