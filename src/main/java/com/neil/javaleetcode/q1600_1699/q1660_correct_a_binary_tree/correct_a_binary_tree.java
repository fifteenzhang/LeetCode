package com.neil.javaleetcode.q1600_1699.q1660_correct_a_binary_tree;
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



class correct_a_binary_tree {

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



    public TreeNode correctBinaryTree(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            while (n-- > 0) {
                TreeNode node = q.pollFirst();
                if (node.right != null) {
                    if (node.right.right != null && q.contains(node.right.right)) {
                        node.right = null;
                        return root;
                    }
                    q.offer(node.right);
                }
                if (node.left != null) {
                    if (node.left.right != null && q.contains(node.left.right)) {
                        node.left = null;
                        return root;
                    }
                    q.offer(node.left);
                }
            }
        }
        return root;
    }
}
