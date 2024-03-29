package com.neil.javaleetcode.q1100_1199.q1110_delete_nodes_and_return_forest;


import java.util.*;


class delete_nodes_and_return_forest {

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


    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        boolean[] del = new boolean[1001];
        for (int d : to_delete) {
            del[d] = true;
        }
        List<TreeNode> res = new ArrayList<>();
        dfs(root, true, del, res);
        return res;
    }

    private TreeNode dfs(TreeNode root, boolean isRoot, boolean[] del, List<TreeNode> res) {
        if (root == null) {
            return null;
        }
        boolean flag = del[root.val];
        if (!flag && isRoot) {
            res.add(root);
        }
        root.left = dfs(root.left, flag, del, res);
        root.right = dfs(root.right, flag, del, res);
        return flag ? null : root;
    }
}
