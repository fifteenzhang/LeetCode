package com.neil.javaleetcode.q0000_0099.q0089_gray_code;


import java.util.*;



class gray_code {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < 1 << n; ++i) {
            ans.add(i ^ (i >> 1));
        }
        return ans;
    }
}
