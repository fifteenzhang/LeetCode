package com.neil.javaleetcode.q1600_1699.q1634_add_two_polynomials_represented_as_linked_lists;


class add_two_polynomials_represented_as_linked_lists {
    public PolyNode addPoly(PolyNode poly1, PolyNode poly2) {
        PolyNode dummy = new PolyNode();
        PolyNode cur = dummy;
        while (poly1 != null || poly2 != null) {
            if (poly1 == null || (poly2 != null && poly2.power > poly1.power)) {
                cur.next = poly2;
                cur = cur.next;
                poly2 = poly2.next;
            } else if (poly2 == null || (poly1 != null && poly1.power > poly2.power)) {
                cur.next = poly1;
                cur = cur.next;
                poly1 = poly1.next;
            } else {
                int val = poly1.coefficient + poly2.coefficient;
                if (val != 0) {
                    cur.next = new PolyNode(val, poly1.power);
                    cur = cur.next;
                }
                poly1 = poly1.next;
                poly2 = poly2.next;
            }
        }
        cur.next = null;
        return dummy.next;
    }
}
