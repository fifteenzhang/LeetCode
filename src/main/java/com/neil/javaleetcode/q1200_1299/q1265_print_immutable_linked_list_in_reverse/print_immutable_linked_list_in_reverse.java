package com.neil.javaleetcode.q1200_1299.q1265_print_immutable_linked_list_in_reverse;


class print_immutable_linked_list_in_reverse {
    public void printLinkedListInReverse(ImmutableListNode head) {
        if (head != null) {
            printLinkedListInReverse(head.getNext());
            head.printValue();
        }
    }
}
