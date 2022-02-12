package com.neil.javaleetcode.q1300_1399.q1313_decompress_run_length_encoded_list;
class decompress_run_length_encoded_list {
    public int[] decompressRLElist(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i += 2) {
            n += nums[i];
        }
        int[] res = new int[n];
        for (int i = 1, k = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i - 1]; ++j) {
                res[k++] = nums[i];
            }
        }
        return res;
    }
}
