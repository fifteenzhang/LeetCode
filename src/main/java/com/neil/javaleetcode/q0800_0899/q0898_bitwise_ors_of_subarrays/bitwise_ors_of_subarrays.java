package com.neil.javaleetcode.q0800_0899.q0898_bitwise_ors_of_subarrays;


import java.util.*;


class bitwise_ors_of_subarrays {
    public int subarrayBitwiseORs(int[] A) {
        int maxVal = Arrays.stream(A).max().getAsInt();
        int mask = (Integer.highestOneBit(maxVal) << 1) - 1;
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < A.length; ++i) {
            int val = A[i];
            res.add(val);
            for (int j = i - 1; j >= 0 && val != mask; --j) {
                val |= A[j];
                res.add(val);
            }
        }
        return res.size();
    }
}
