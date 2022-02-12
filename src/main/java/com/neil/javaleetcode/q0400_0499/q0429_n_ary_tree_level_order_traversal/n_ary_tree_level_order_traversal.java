package com.neil.javaleetcode.q0400_0499.q0429_n_ary_tree_level_order_traversal;


import java.util.ArrayList;
import java.util.List;

class n_ary_tree_level_order_traversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, 0, res);
        return res;
    }

    private void dfs(Node root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() <= level) {
            res.add(new ArrayList<>());
        }
        res.get(level++).add(root.val);
        for (Node child : root.children) {
            dfs(child, level, res);
        }
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
