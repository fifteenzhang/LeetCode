package com.neil.javaleetcode.q1600_1699.q1650_lowest_common_ancestor_of_a_binary_tree_iii;


class lowest_common_ancestor_of_a_binary_tree_iii {

    // Definition for a Node.
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node parent;
    };

    public Node lowestCommonAncestor(Node p, Node q) {
        Node a = p, b = q;
        while (a != b) {
            a = a.parent == null ? q : a.parent;
            b = b.parent == null ? p : b.parent;
        }
        return a;
    }
}
