package com.neil.javaleetcode.q0100_0199.q0119_pascals_triangle_ii;

import java.util.ArrayList;
import java.util.List;

class pascals_triangle_ii {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; ++i) {
            row.add(1);
        }
        for (int i = 2; i < rowIndex + 1; ++i) {
            for (int j = i - 1; j > 0; --j) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }
}
