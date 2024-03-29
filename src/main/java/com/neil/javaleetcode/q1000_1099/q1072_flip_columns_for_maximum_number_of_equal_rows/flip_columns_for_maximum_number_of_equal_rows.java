package com.neil.javaleetcode.q1000_1099.q1072_flip_columns_for_maximum_number_of_equal_rows;


import java.util.*;


class flip_columns_for_maximum_number_of_equal_rows {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> map = new HashMap<>();
        for (int[] row : matrix) {
            if (row[0] == 1) {
                for (int i = 0; i < row.length; ++i) {
                    row[i] ^= 1;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int x : row) {
                sb.append(x);
            }
            String s = sb.toString();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map.values().stream().max(Integer::compareTo).get();
    }
}
