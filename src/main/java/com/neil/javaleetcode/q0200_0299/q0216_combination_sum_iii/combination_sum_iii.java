package com.neil.javaleetcode.q0200_0299.q0216_combination_sum_iii;

import java.util.*;



class combination_sum_iii {
    private List<List<Integer>> ans;

    public List<List<Integer>> combinationSum3(int k, int n) {
        ans = new ArrayList<>();
        dfs(0, n, k, new ArrayList<>());
        return ans;
    }

    private void dfs(int i, int n, int k, List<Integer> t) {
        if (i > 9 || n < 0 || t.size() > k) {
            return;
        }
        if (n == 0 && t.size() == k) {
            ans.add(new ArrayList<>(t));
            return;
        }
        ++i;
        t.add(i);
        dfs(i, n - i, k, t);
        t.remove(t.size() - 1);
        dfs(i, n, k, t);
    }
}
