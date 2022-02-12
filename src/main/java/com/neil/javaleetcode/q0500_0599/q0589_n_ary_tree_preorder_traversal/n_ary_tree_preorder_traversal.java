package com.neil.javaleetcode.q0500_0599.q0589_n_ary_tree_preorder_traversal;

import java.util.*;

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


class n_ary_tree_preorder_traversal {
    public List<Integer> preorder(Node root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> ans = new ArrayList<>();
        Deque<Node> stk = new ArrayDeque<>();
        stk.push(root);
        while (!stk.isEmpty()) {
            Node node = stk.pop();
            ans.add(node.val);
            List<Node> children = node.children;
            for (int i = children.size() - 1; i >= 0; --i) {
                stk.push(children.get(i));
            }
        }
        return ans;
    }
}
