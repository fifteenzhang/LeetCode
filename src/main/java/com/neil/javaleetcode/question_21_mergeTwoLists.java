package com.neil.javaleetcode;


//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//
//
//
// 示例 1：
//
//
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]
//
//
// 示例 2：
//
//
//输入：l1 = [], l2 = []
//输出：[]
//
//
// 示例 3：
//
//
//输入：l1 = [], l2 = [0]
//输出：[0]
//
//
//
//
// 提示：
//
//
// 两个链表的节点数目范围是 [0, 50]
// -100 <= Node.val <= 100
// l1 和 l2 均按 非递减顺序 排列
//
// Related Topics 递归 链表
// 👍 1499 👎 0


import org.springframework.boot.SpringApplication;

//leetcode submit region begin(Prohibit modification and deletion)

/**
 * 合并两个有序链表
 */
public class question_21_mergeTwoLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(3));
        ListNode l2 = new ListNode(2, new ListNode(3));
        ListNode result = mergeTwoListsSelf(l1, l2);
    }

    public static class ListNode {
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

    /**
     * 官方解答，递归
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        if (l1 == null) {
            result = l2;
        } else if (l2 == null) {
            result = l1;
        } else {
            if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                result = l1;
            } else {
                l2.next = mergeTwoLists(l1, l2.next);
                result = l2;
            }
        }
        return result;
    }

    /**
     * 最初想法，迭代
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoListsSelf(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode tl1 = null;
        ListNode tl2 = null;
        ListNode tResult = null;
        if (l1 == null) {
            result = l2;
        } else if (l2 == null) {
            result = l1;
        } else {
            tl1 = l1;
            tl2 = l2;
            if (tl1.val < tl2.val) {
                tResult = tl1;
                tl1 = tl1.next;
            } else {
                tResult = tl2;
                tl2 = tl2.next;
            }
            result = tResult;
            while (tl1 != null && tl2 != null) {
                if (tl1.val < tl2.val) {
                    tResult.next = tl1;
                    tl1 = tl1.next;
                } else {
                    tResult.next = tl2;
                    tl2 = tl2.next;
                }
                // 重要
                tResult = tResult.next;
            }
            tResult.next = tl1 != null ? tl1 : (tl2 != null ? tl2 : null);
        }
        return result;
    }


    /**
     * 最初想法，迭代 -- 不修改入参
     * 性能很差，需要new对象
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoListsNoChange(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode tl1 = l1;
        ListNode tl2 = l2;
        ListNode tResult = result;
        if (tl1 != null && tl2 != null) {
            if (tl1.val < tl2.val) {
                result = new ListNode(tl1.val);
                tResult = result;
                tl1 = tl1.next;
            } else {
                result = new ListNode(tl2.val);
                tResult = result;
                tl2 = tl2.next;
            }
            while (tl1 != null) {
                while (tl2 != null) {
                    if (tl1 != null && tl2 != null && tl1.val < tl2.val) {
                        tResult.next = new ListNode(tl1.val);
                        tl1 = tl1.next;
                    } else {
                        tResult.next = new ListNode(tl2.val);
                        tl2 = tl2.next;
                    }

                    if (tResult.next != null) {
                        tResult = tResult.next;
                    }
                }
                if (tl1 != null) {
                    tResult.next = new ListNode(tl1.val);
                    tl1 = tl1.next;
                }
                if (tResult.next != null) {
                    tResult = tResult.next;
                }
            }
            while (tl1 != null) {
                tResult.next = new ListNode(tl1.val);
                tl1 = tl1.next;
            }
            while (tl2 != null) {
                tResult.next = new ListNode(tl2.val);
                tl2 = tl2.next;
            }
        } else if (tl1 != null) {
            result = tl1;
        } else if (tl2 != null) {
            result = tl2;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

