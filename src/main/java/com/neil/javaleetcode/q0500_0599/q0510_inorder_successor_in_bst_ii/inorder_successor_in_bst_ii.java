package com.neil.javaleetcode.q0500_0599.q0510_inorder_successor_in_bst_ii;


class inorder_successor_in_bst_ii {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node parent;
    };

    public Node inorderSuccessor(Node node) {
        if (node.right != null) {
            node = node.right;
            while (node.left != null) {
                node = node.left;
            }
            return node;
        }
        while (node.parent != null && node == node.parent.right) {
            node = node.parent;
        }
        return node.parent;
    }
}
