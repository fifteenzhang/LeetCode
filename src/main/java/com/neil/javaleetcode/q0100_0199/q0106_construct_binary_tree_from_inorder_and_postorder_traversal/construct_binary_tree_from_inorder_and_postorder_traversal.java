package com.neil.javaleetcode.q0100_0199.q0106_construct_binary_tree_from_inorder_and_postorder_traversal;


import java.util.*;


class construct_binary_tree_from_inorder_and_postorder_traversal {

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

    private Map<Integer, Integer> indexes = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; ++i) {
            indexes.put(inorder[i], i);
        }
        return dfs(inorder, postorder, 0, 0, inorder.length);
    }

    private TreeNode dfs(int[] inorder, int[] postorder, int i, int j, int n) {
        if (n <= 0) {
            return null;
        }
        int v = postorder[j + n - 1];
        int k = indexes.get(v);
        TreeNode root = new TreeNode(v);
        root.left = dfs(inorder, postorder, i, j, k - i);
        root.right = dfs(inorder, postorder, k + 1, j + k - i, n - k + i - 1);
        return root;
    }
}
