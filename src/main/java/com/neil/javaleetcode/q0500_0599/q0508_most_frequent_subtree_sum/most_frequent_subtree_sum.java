package com.neil.javaleetcode.q0500_0599.q0508_most_frequent_subtree_sum;
import java.util.*;



class most_frequent_subtree_sum {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    private Map<Integer, Integer> counter;
    private int mx;

    public int[] findFrequentTreeSum(TreeNode root) {
        counter = new HashMap<>();
        mx = Integer.MIN_VALUE;
        dfs(root);
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == mx) {
                res.add(entry.getKey());
            }
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); ++i) {
            ans[i] = res.get(i);
        }
        return ans;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int s = root.val + dfs(root.left) + dfs(root.right);
        counter.put(s, counter.getOrDefault(s, 0) + 1);
        mx = Math.max(mx, counter.get(s));
        return s;
    }
}
