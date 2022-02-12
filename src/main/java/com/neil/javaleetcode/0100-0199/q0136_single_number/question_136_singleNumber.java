/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.neil.javaleetcode;
//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//
// 说明：
//
// 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
//
// 示例 1:
//
// 输入: [2,2,1]
//输出: 1
//
//
// 示例 2:
//
// 输入: [4,1,2,1,2]
//输出: 4
// Related Topics 位运算 哈希表
// 👍 1681 👎 0

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 只出现一次的数字
 *
 * @date 2021/2/3 18:52
 */
public class question_136_singleNumber {
    public static void main(String[] args) {

        int result = singleNumber(new int[]{4, 6, 4, 7, 7});
    }

    /**
     * Map统计次数
     *
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int result = 0;
        if (nums != null) {
            int mapThreshold = (int) Math.ceil((double) nums.length * 0.75D);
            Map<Integer, Integer> numCountMap = new HashMap<Integer, Integer>(mapThreshold);
            for (int num : nums) {
                if (numCountMap.containsKey(num)) {
                    numCountMap.put(num, numCountMap.get(num).intValue() + 1);
                } else {
                    numCountMap.put(num, 1);
                }
            }
            result = numCountMap.entrySet().stream().filter(f -> f.getValue() == 1).mapToInt(m -> m.getKey()).findFirst().orElse(0);
        }
        return result;
    }

    /**
     * 不用所有都统计，超过1次的直接移除
     * 负优化，增删操作都会消耗，额外引入了list，损耗远高于numCountMap.entrySet().stream().filter(f -> f.getValue() == 1).mapToInt(m -> m.getKey()).findFirst().orElse(0);
     *
     * @param nums
     * @return
     */
    public static int singleNumber2(int[] nums) {
        int result = 0;
        if (nums != null) {
            List<Integer> resultNums = new ArrayList<>(nums.length);
            // map使得查询只有一次，不用遍历，减少复杂度
            int mapThreshold = (int) Math.ceil((double) nums.length * 0.75D);
            Map<Integer, Integer> numCountMap = new HashMap<>(mapThreshold);
            for (int num : nums) {
                if (numCountMap.containsKey(num)) {
                    resultNums.removeIf(f -> f == num);
                } else {
                    numCountMap.put(num, 1);
                    resultNums.add(num);
                }
            }
            result = resultNums.size() > 0 ? resultNums.get(0) : 0;
        }
        return result;
    }
}
