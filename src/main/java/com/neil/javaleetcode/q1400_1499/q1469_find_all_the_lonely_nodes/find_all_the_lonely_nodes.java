package com.neil.javaleetcode.q1400_1499.q1469_find_all_the_lonely_nodes;
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


class find_all_the_lonely_nodes {


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

    private List<Integer> res;

    public List<Integer> getLonelyNodes(TreeNode root) {
        res = new ArrayList<>();
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right != null) {
            res.add(root.right.val);
        }
        if (root.left != null && root.right == null) {
            res.add(root.left.val);
        }
        traverse(root.left);
        traverse(root.right);
    }
}
