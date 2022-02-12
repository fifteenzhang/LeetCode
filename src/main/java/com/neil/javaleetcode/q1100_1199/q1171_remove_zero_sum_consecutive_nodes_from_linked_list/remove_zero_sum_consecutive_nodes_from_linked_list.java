package com.neil.javaleetcode.q1100_1199.q1171_remove_zero_sum_consecutive_nodes_from_linked_list;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


import java.util.*;



class remove_zero_sum_consecutive_nodes_from_linked_list {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        Map<Integer, ListNode> preSumNode = new HashMap<>();
        int s = 0;
        for (ListNode cur = dummy; cur != null; cur = cur.next) {
            s += cur.val;
            preSumNode.put(s, cur);
        }
        s = 0;
        for (ListNode cur = dummy; cur != null; cur = cur.next) {
            s += cur.val;
            cur.next = preSumNode.get(s).next;
        }
        return dummy.next;
    }
}
