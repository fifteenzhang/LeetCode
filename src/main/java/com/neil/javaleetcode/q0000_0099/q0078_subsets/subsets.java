package com.neil.javaleetcode.q0000_0099.q0078_subsets;


import java.util.*;


class subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(0, nums, new ArrayList<>(), res);
        return res;
    }

    private void dfs(int i, int[] nums, List<Integer> t, List<List<Integer>> res) {
        res.add(new ArrayList<>(t));
        if (i == nums.length) {
            return;
        }
        for (int j = i; j < nums.length; ++j) {
            t.add(nums[j]);
            dfs(j + 1, nums, t, res);
            t.remove(t.size() - 1);
        }
    }
}
