package com.neil.javaleetcode.q0200_0299.q0257_binary_tree_paths;


import java.util.*;




class binary_tree_paths {

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


    private List<String> ans;
    private List<String> t;

    public List<String> binaryTreePaths(TreeNode root) {
        ans = new ArrayList<>();
        t = new ArrayList<>();
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        t.add(root.val + "");
        if (root.left == null && root.right == null) {
            ans.add(String.join("->", t));
        }
        dfs(root.left);
        dfs(root.right);
        t.remove(t.size() - 1);
    }
}
