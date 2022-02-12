package com.neil.javaleetcode.q1500_1599.q1506_find_root_of_n_ary_tree;

import java.util.ArrayList;
import java.util.List;

class find_root_of_n_ary_tree {


    // Definition for a Node.
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

    public Node findRoot(List<Node> tree) {
        int xor = 0;
        for (Node node : tree) {
            xor ^= node.val;
            for (Node child : node.children) {
                xor ^= child.val;
            }
        }
        for (Node node :tree) {
            if (node.val == xor) {
                return node;
            }
        }
        return null;
    }
}
