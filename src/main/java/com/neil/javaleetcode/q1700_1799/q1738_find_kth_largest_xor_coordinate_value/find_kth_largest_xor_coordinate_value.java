package com.neil.javaleetcode.q1700_1799.q1738_find_kth_largest_xor_coordinate_value;


import java.util.*;


class find_kth_largest_xor_coordinate_value {
    public int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int[][] s = new int[m + 1][n + 1];
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                s[i + 1][j + 1] = s[i + 1][j] ^ s[i][j + 1] ^ s[i][j] ^ matrix[i][j];
                ans.add(s[i + 1][j + 1]);
            }
        }
        Collections.sort(ans);
        return ans.get(ans.size() - k);
    }
}
