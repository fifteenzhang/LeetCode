package com.neil.javaleetcode.q0800_0899.q0817_linked_list_components;
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


import java.util.*;


class linked_list_components {

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



    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            s.add(num);
        }
        int res = 0;
        boolean pre = true;
        while (head != null) {
            if (s.contains(head.val)) {
                if (pre) {
                    ++res;
                    pre = false;
                }
            } else {
                pre = true;
            }
            head = head.next;
        }
        return res;
    }
}
