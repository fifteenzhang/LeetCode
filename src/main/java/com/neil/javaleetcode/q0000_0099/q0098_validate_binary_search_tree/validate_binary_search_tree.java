package com.neil.javaleetcode.q0000_0099.q0098_validate_binary_search_tree;

class validate_binary_search_tree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private Integer prev;

    public boolean isValidBST(TreeNode root) {
        prev = null;
        return dfs(root);
    }

    private boolean dfs(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!dfs(root.left)) {
            return false;
        }
        if (prev != null && prev >= root.val) {
            return false;
        }
        prev = root.val;
        if (!dfs(root.right)) {
            return false;
        }
        return true;
    }
}
