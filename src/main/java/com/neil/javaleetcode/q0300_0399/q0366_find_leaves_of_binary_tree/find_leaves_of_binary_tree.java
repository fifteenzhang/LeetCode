package com.neil.javaleetcode.q0300_0399.q0366_find_leaves_of_binary_tree;


import java.util.*;


class find_leaves_of_binary_tree {


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


    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        TreeNode prev = new TreeNode(0, root, null);
        while (prev.left != null) {
            List<Integer> t = new ArrayList<>();
            dfs(prev.left, prev, t);
            res.add(t);
        }
        return res;
    }

    private void dfs(TreeNode root, TreeNode prev, List<Integer> t) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            t.add(root.val);
            if (prev.left == root) {
                prev.left = null;
            } else {
                prev.right = null;
            }
        }
        dfs(root.left, root, t);
        dfs(root.right, root, t);
    }
}
