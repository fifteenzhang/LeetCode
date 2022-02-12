package com.neil.javaleetcode.q0100_0199.q0199_binary_tree_right_side_view;


import java.util.*;


class binary_tree_right_side_view {

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


    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Deque<TreeNode> q = new LinkedList<>();
        q.offerLast(root);
        while (!q.isEmpty()) {
            ans.add(q.peekFirst().val);
            for (int i = q.size(); i > 0; --i) {
                TreeNode node = q.pollFirst();
                if (node.right != null) {
                    q.offerLast(node.right);
                }
                if (node.left != null) {
                    q.offerLast(node.left);
                }
            }
        }
        return ans;
    }
}
