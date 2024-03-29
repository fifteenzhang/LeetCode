package com.neil.javaleetcode.q0200_0299.q0250_count_univalue_subtrees;

class count_univalue_subtrees {

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



    private int ans;

    public int countUnivalSubtrees(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans;
    }

    private boolean dfs(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = dfs(root.left);
        boolean right = dfs(root.right);
        boolean t = true;
        if (root.left != null && root.left.val != root.val) {
            t = false;
        }
        if (root.right != null && root.right.val != root.val) {
            t = false;
        }
        if (left && t && right) {
            ++ans;
        }
        return left && t && right;
    }
}
