package com.neil.javaleetcode.q1700_1799.q1720_decode_xored_array;
class decode_xored_array {
    public int[] decode(int[] encoded, int first) {
        int[] res = new int[encoded.length + 1];
        res[0] = first;
        for (int i = 0; i < encoded.length; ++i) {
            res[i + 1] = res[i] ^ encoded[i];
        }
        return res;
    }
}
