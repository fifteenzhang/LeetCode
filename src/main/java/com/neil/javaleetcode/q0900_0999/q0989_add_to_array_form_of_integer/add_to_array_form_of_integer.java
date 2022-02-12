package com.neil.javaleetcode.q0900_0999.q0989_add_to_array_form_of_integer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class add_to_array_form_of_integer {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int n = A.length - 1;
        List<Integer> res = new ArrayList<>();
        int carry = 0;
        while (n >= 0 || K != 0 || carry != 0) {
            carry += (n < 0 ? 0 : A[n]) + (K % 10);
            res.add(carry % 10);
            K /= 10;
            carry /= 10;
            --n;
        }
        Collections.reverse(res);
        return res;
    }
}
