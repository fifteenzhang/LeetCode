package com.neil.javaleetcode.q1000_1099.q1022_sum_of_root_to_leaf_binary_numbers;
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


import java.util.*;



class sum_of_root_to_leaf_binary_numbers {

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



    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int t) {
        if (root == null) {
            return 0;
        }
        t = (t << 1) | root.val;
        if (root.left == null && root.right == null) {
            return t;
        }
        return dfs(root.left, t) + dfs(root.right, t);
    }
}
