package com.neil.javaleetcode.q0900_0999.q0919_complete_binary_tree_inserter;
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



class complete_binary_tree_inserter {

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



    private List<TreeNode> tree;

    public complete_binary_tree_inserter(TreeNode root) {
        tree = new ArrayList<>();
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offerLast(root);
        while (!q.isEmpty()) {
            TreeNode node = q.pollFirst();
            tree.add(node);
            if (node.left != null) {
                q.offerLast(node.left);
            }
            if (node.right != null) {
                q.offerLast(node.right);
            }
        }
    }
    
    public int insert(int val) {
        int pidx = (tree.size() - 1) >> 1;
        TreeNode node = new TreeNode(val);
        tree.add(node);
        if (tree.get(pidx).left == null) {
            tree.get(pidx).left = node;
        } else {
            tree.get(pidx).right = node;
        }
        return tree.get(pidx).val;
    }
    
    public TreeNode get_root() {
        return tree.get(0);
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */
