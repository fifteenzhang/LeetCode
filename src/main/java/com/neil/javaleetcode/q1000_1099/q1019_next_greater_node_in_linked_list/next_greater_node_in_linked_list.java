package com.neil.javaleetcode.q1000_1099.q1019_next_greater_node_in_linked_list;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


import java.util.*;



class next_greater_node_in_linked_list {

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


    public int[] nextLargerNodes(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }
        Deque<Integer> s = new ArrayDeque<>();
        int[] larger = new int[nums.size()];
        for (int i = 0; i < nums.size(); ++i) {
            while (!s.isEmpty() && nums.get(s.peek()) < nums.get(i)) {
                larger[s.pop()] = nums.get(i);
            }
            s.push(i);
        }
        return larger;
    }
}
