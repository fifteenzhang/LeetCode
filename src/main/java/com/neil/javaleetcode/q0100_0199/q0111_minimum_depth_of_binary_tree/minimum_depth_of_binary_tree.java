package com.neil.javaleetcode.q0100_0199.q0111_minimum_depth_of_binary_tree;

class minimum_depth_of_binary_tree {

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





    public int minDepth(TreeNode root) {
        return dfs(root);
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            return 1 + dfs(root.right);
        }
        if (root.right == null) {
            return 1 + dfs(root.left);
        }
        return 1 + Math.min(dfs(root.left), dfs(root.right));
    }
}
