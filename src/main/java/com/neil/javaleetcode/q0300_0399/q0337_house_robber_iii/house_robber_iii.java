package com.neil.javaleetcode.q0300_0399.q0337_house_robber_iii;

import java.util.*;



class house_robber_iii {

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


    private Map<TreeNode, Integer> memo;

    public int rob(TreeNode root) {
        memo = new HashMap<>();
        return dfs(root);
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (memo.containsKey(root)) {
            return memo.get(root);
        }
        int a = dfs(root.left) + dfs(root.right);
        int b = root.val;
        if (root.left != null) {
            b += dfs(root.left.left) + dfs(root.left.right);
        }
        if (root.right != null) {
            b += dfs(root.right.left) + dfs(root.right.right);
        }
        int res = Math.max(a, b);
        memo.put(root, res);
        return res;
    }
}
