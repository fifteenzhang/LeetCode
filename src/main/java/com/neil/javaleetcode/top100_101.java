/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.neil.javaleetcode;
//给定一个二叉树，检查它是否是镜像对称的。
//
//
//
// 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
//
//     1
//   / \
//  2   2
// / \ / \
//3  4 4  3
//
//
//
//
// 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
//
//     1
//   / \
//  2   2
//   \   \
//   3    3
//
//
//
//
// 进阶：
//
// 你可以运用递归和迭代两种方法解决这个问题吗？
// Related Topics 树 深度优先搜索 广度优先搜索
// 👍 1215 👎 0

import sun.reflect.generics.tree.Tree;

/**
 * 对称二叉树
 *
 * @date 2021/1/28 18:53
 */
public class top100_101 {
    public static void main(String[] args) {

        boolean result = isSymmetric(new TreeNode(1, new TreeNode(2, null, new TreeNode(3)),
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
     * 递归
     * 判断祖父节点的左子父节点的左子孙节点的值 等于 右子父节点的右子孙节点的值
     * 判断祖父节点的左子父节点的右子孙节点的值 等于 右子父节点的左子孙节点的值
     * 并且 左子父节点 的值 等于 右子父节点的值
     * 1
     * 2   2
     * 3 4 4 3
     * 递归截至条件为 当前节点都为null
     *
     * @param root
     * @return
     */
    public static boolean isSymmetric(TreeNode root) {
        boolean result = false;
        if (root != null) {
            result = isMirrorForLeaf(root.left, root.right);
        } else {
            result = true;
        }
        return result;
    }


    private static boolean isMirrorForLeaf(TreeNode l1, TreeNode l2) {
        boolean result = false;
        if (l1 == null && l2 == null) {
            result = true;
        } else if (l1 != null && l2 != null) {
            if (l1.val == l2.val) {
                boolean leftResult = isMirrorForLeaf(l1.left, l2.right);
                boolean rightResult = isMirrorForLeaf(l1.right, l2.left);
                result = leftResult == true && leftResult == rightResult;
            }
        }
        return result;
    }

}
