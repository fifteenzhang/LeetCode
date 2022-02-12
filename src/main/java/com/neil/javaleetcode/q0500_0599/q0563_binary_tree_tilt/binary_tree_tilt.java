package com.neil.javaleetcode.q0500_0599.q0563_binary_tree_tilt;

class binary_tree_tilt {

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

    public int findTilt(TreeNode root) {
        ans = 0;
        sum(root);
        return ans;
    }

    private int sum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = sum(root.left);
        int right = sum(root.right);
        ans += Math.abs(left - right);
        return root.val + left + right;
    }
}
