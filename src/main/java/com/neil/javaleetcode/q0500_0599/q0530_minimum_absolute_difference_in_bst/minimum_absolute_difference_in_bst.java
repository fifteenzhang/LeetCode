package com.neil.javaleetcode.q0500_0599.q0530_minimum_absolute_difference_in_bst;

class minimum_absolute_difference_in_bst {

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





    private int minDiff = Integer.MAX_VALUE;
    private Integer pre;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (pre != null) minDiff = Math.min(minDiff, Math.abs(root.val - pre));
        pre = root.val;
        inorder(root.right);
    }
}
