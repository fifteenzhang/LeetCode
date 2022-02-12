package com.neil.javaleetcode.q1400_1499.q1428_leftmost_column_with_at_least_a_one;

import java.util.*;



class leftmost_column_with_at_least_a_one {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> scale = binaryMatrix.dimensions();
        int rows = scale.get(0), cols = scale.get(1);
        int res = -1;
        for (int row = 0; row < rows; ++row) {
            int left = 0, right = cols - 1;
            while (left < right) {
                int mid = (left + right) >> 1;
                if (binaryMatrix.get(row, mid) == 1) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            if (binaryMatrix.get(row, left) == 1) {
                if (res == -1) {
                    res = left;
                } else {
                    res = Math.min(res, left);
                }
            }
        }
        return res;
    }
}
