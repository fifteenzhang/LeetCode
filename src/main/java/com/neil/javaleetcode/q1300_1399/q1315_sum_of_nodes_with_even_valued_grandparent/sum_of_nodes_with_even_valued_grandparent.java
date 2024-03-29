package com.neil.javaleetcode.q1300_1399.q1315_sum_of_nodes_with_even_valued_grandparent;

class sum_of_nodes_with_even_valued_grandparent {

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    private int res;

    public int sumEvenGrandparent(TreeNode root) {
        res = 0;
        dfs(root, root.left);
        dfs(root, root.right);
        return res;
    }

    private void dfs(TreeNode g, TreeNode p) {
        if (p == null) {
            return;
        }
        if (g.val % 2 == 0) {
            if (p.left != null) {
                res += p.left.val;
            }
            if (p.right != null) {
                res += p.right.val;
            }
        }
        dfs(p, p.left);
        dfs(p, p.right);
    }
}
