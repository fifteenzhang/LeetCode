package com.neil.javaleetcode.q0700_0799.q0708_insert_into_a_sorted_circular_linked_list;
/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class insert_into_a_sorted_circular_linked_list {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node insert(Node head, int insertVal) {
        Node node = new Node(insertVal);
        if (head == null) {
            node.next = node;
            return node;
        }
        Node pre = head, cur = head.next;
        while (true) {
            if ((pre.val <= insertVal && insertVal <= cur.val) || (pre.val > cur.val && (insertVal >= pre.val || cur.val >= insertVal))) {
                break;
            }
            pre = cur;
            cur = cur.next;
            if (pre == head) {
                break;
            }
        }
        pre.next = node;
        node.next = cur;
        return head;
    }
}
