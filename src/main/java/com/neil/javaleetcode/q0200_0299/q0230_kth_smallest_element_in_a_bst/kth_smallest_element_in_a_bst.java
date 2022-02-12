package com.neil.javaleetcode.q0200_0299.q0230_kth_smallest_element_in_a_bst;

class kth_smallest_element_in_a_bst {

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



    private int k;
    private int ans;

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return ans; 
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (--k == 0) {
            ans = root.val;
            return;
        }
        dfs(root.right);
    }
}
