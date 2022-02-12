package com.neil.javaleetcode.q0700_0799.q0783_minimum_distance_between_bst_nodes;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class minimum_distance_between_bst_nodes {


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

    public int minDiffInBST(TreeNode root) {
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
