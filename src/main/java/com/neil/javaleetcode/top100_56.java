/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.neil.javaleetcode;
//以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返
//回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
//
//
//
// 示例 1：
//
//
//输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
//输出：[[1,6],[8,10],[15,18]]
//解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
//
//
// 示例 2：
//
//
//输入：intervals = [[1,4],[4,5]]
//输出：[[1,5]]
//解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。
//
//
//
// 提示：
//
//
// 1 <= intervals.length <= 104
// intervals[i].length == 2
// 0 <= starti <= endi <= 104
//
// Related Topics 排序 数组
// 👍 796 👎 0

import java.util.*;
import java.util.stream.Collectors;

/**
 * 合并区间
 *
 * @date 2021/2/5 17:14
 */
public class top100_56 {
    public static void main(String[] args) {

        int[][] result = merge2(new int[][]{{4, 6}, {1, 2}, {1, 3}});
    }

    public static int[][] merge(int[][] intervals) {
        int[][] result = intervals;
        if (intervals != null && intervals.length > 1) {
            Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
            result = merge(0, intervals);
        }
        return result;
    }

    /**
     * 递归，第一个去合并到最后一个，形成新的数组，再合并，直到不能合并为止
     * 排序是因为leetcode答案中结果是从小到大的
     *
     * @param start
     * @param intervals
     * @return
     */
    private static int[][] merge(int start, int[][] intervals) {
        int[][] result = null;
        List<int[]> currentList = null;
        if (intervals.length > 1) {
            currentList = new ArrayList<>(intervals.length);
            for (int i = 0; i < start; i++) {
                currentList.add(intervals[i]);
            }
            if (start < intervals.length) {
                int[] first = intervals[start];
                for (int i = start + 1; i < intervals.length; i++) {
                    int[] current = intervals[i];
                    // 边界链接
                    if ((current[0] == first[1]) || (current[1] == first[0])) {
                        first = new int[]{Math.min(first[0], current[0]), Math.max(first[1], current[1])};
                    }
                    // 有交集才移动
                    else if ((current[0] <= first[1] && current[1] >= first[0]) || (current[0] >= first[1] && current[1] <= first[0])) {
                        int moveStep = current[0] - first[0];
                        int moveAfter = first[1] + moveStep;
                        if (moveAfter <= current[1]) {
                            first = new int[]{Math.min(first[0], current[0]), current[1]};
                        } else {
                            first = new int[]{Math.min(first[0], current[0]), Math.max(current[1], first[1])};
                        }
                    } else {
                        currentList.add(current);
                    }
                }
                currentList.add(first);
                result = (int[][]) currentList.stream().sorted(Comparator.comparingInt(m -> m[0])).collect(Collectors.toList()).toArray(new int[0][]);
                if (result.length != intervals.length) {
                    result = merge(start, result);
                } else if (start < (result.length - 1)) {
                    result = merge(start + 1, result);
                }
            }
        } else {
            result = intervals;
        }

        return result;
    }


    /**
     * 递归，第一个去合并到最后一个，形成新的数组，再合并，直到不能合并为止
     * 既然已经排序了，第一个合并到A无法合并，则A后面的更加不能合并，合并结果直接加入结果集
     * 直接从A后面的重新开始合并
     *
     * @param intervals
     * @return
     */
    public static int[][] merge2(int[][] intervals) {
        int[][] result = null;
        if (intervals != null && intervals.length > 1) {
            Arrays.sort(intervals, Comparator.comparingInt((int[] o) -> o[0]).thenComparingInt(op -> op[1]));
            List<int[]> currentList = new ArrayList<>(intervals.length);
            int[] first = intervals[0];
            for (int i = 1; i < intervals.length; i++) {
                int[] current = intervals[i];
                // 边界链接
                if ((current[0] == first[1]) || (current[0] <= first[1] && current[1] >= first[0])) {
                    first = new int[]{Math.min(first[0], current[0]), Math.max(first[1], current[1])};
                } else {
                    currentList.add(first);
                    first = current;
                }
            }
            currentList.add(first);
            result = (int[][]) currentList.stream().sorted(Comparator.comparingInt(m -> m[0])).collect(Collectors.toList()).toArray(new int[0][]);
        } else {
            result = intervals;
        }
        return result;
    }
}
