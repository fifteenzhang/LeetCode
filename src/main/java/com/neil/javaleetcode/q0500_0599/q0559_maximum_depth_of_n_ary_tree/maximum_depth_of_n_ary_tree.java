package com.neil.javaleetcode.q0500_0599.q0559_maximum_depth_of_n_ary_tree;
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

import java.util.List;

class maximum_depth_of_n_ary_tree {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int ans = 1;
        for (Node child : root.children) {
            ans = Math.max(ans, 1 + maxDepth(child));
        }
        return ans;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

}
