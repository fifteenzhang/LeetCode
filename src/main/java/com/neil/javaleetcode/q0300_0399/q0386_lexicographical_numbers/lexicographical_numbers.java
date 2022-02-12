package com.neil.javaleetcode.q0300_0399.q0386_lexicographical_numbers;

import java.util.*;



class lexicographical_numbers {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < 10; ++i) {
            dfs(res, i, n);
        }
        return res;
    }

    private void dfs(List<Integer> res, int i, int n) {
        if (i > n) {
            return;
        }
        res.add(i);
        for (int j = 0; j < 10; ++j) {
            dfs(res, i * 10 + j, n);
        }
    }
}
