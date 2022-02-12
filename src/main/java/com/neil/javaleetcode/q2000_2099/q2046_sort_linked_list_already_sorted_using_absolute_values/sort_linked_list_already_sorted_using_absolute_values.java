package com.neil.javaleetcode.q2000_2099.q2046_sort_linked_list_already_sorted_using_absolute_values;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class sort_linked_list_already_sorted_using_absolute_values {

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


    public ListNode sortLinkedList(ListNode head) {
        ListNode prev = head, curr = head.next;
        while (curr != null) {
            if (curr.val < 0) {
                ListNode t = curr.next;
                prev.next = t;
                curr.next = head;
                head = curr;
                curr = t;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
