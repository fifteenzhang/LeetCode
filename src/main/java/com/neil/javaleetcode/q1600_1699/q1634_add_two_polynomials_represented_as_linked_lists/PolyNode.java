package com.neil.javaleetcode.q1600_1699.q1634_add_two_polynomials_represented_as_linked_lists;

public class PolyNode {
    int coefficient, power;
    PolyNode next = null;

    PolyNode() {
    }

    PolyNode(int x, int y) {
        this.coefficient = x;
        this.power = y;
    }

    PolyNode(int x, int y, PolyNode next) {
        this.coefficient = x;
        this.power = y;
        this.next = next;
    }
}
