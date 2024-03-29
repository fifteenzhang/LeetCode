package com.neil.javaleetcode.q0500_0599.q0515_find_largest_value_in_each_tree_row;


import java.util.*;

class find_largest_value_in_each_tree_row {

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



    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        List<Integer> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            int t = Integer.MIN_VALUE;
            for (int i = 0, n = q.size(); i < n; ++i) {
                TreeNode node = q.poll();
                t = Math.max(t, node.val);
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            ans.add(t);
        }
        return ans;
    }
}
