/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.neil.javaleetcode;
//给定一个二叉树，找出其最大深度。
//
// 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
//
// 说明: 叶子节点是指没有子节点的节点。
//
// 示例：
//给定二叉树 [3,9,20,null,null,15,7]，
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
//
// 返回它的最大深度 3 。
// Related Topics 树 深度优先搜索 递归
// 👍 783 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

/**
 * 二叉树的最大深度
 *
 * @date 2021/1/29 18:00
 */
public class top100_104 {
    public static void main(String[] args) {

        int result = maxDepth(new TreeNode(1, new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3))));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * 递归，传入当前深度，累加下一节点的深度
     * 截至条件为 左右子树都为null
     *
     * @param root
     * @return
     */
    public static int maxDepth(TreeNode root) {
        int result = 0;
        if (root != null) {
            result = result + 1;
            result = getNodeDepth(root.left, root.right, result);
        }
        return result;
    }

    private static int getNodeDepth(TreeNode l1, TreeNode l2, int currentDepth) {
        int result = currentDepth;
        if (l1 != null || l2 != null) {
            result = result + 1;
            int leftLength = result;
            int rightLength = result;
            if (l1 != null && (l1.left != null || l1.right != null)) {
                leftLength = getNodeDepth(l1.left, l1.right, result);
            }
            if (l2 != null && (l2.left != null || l2.right != null)) {
                rightLength = getNodeDepth(l2.left, l2.right, result);
            }
            result = Math.max(leftLength, rightLength);

        }
        return result;
    }
}
