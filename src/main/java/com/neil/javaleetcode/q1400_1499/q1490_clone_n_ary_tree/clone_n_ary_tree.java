package com.neil.javaleetcode.q1400_1499.q1490_clone_n_ary_tree;

import java.util.ArrayList;
import java.util.List;

class clone_n_ary_tree {

    class Node {
        public int val;
        public List<Node> children;


        public Node() {
            children = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            children = new ArrayList<Node>();
        }

        public Node(int _val,ArrayList<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public Node cloneTree(Node root) {
        if (root == null) {
            return null;
        }
        Node node = new Node(root.val);
        for (Node child : root.children) {
            node.children.add(cloneTree(child));
        }
        return node;
    }
}
