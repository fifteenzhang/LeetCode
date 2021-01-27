/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.neil.javaleetcode;


//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//
// 示例:
//
// 输入: [-2,1,-3,4,-1,2,1,-5,4]
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
//
//
// 进阶:
//
// 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
// Related Topics 数组 分治算法 动态规划
// 👍 2828 👎 0

/**
 * @author 张璘
 * @date 2021/1/27 18:07
 */
public class top100_53 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, -5, -1, 6};
        int result = maxSubArrayDynamic(nums);
    }

    /**
     * 最初想法 -- 暴力双重循环
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int result = 0;
        if (nums != null && nums.length > 0) {
            result = nums[0];
            for (int i = 0; i < nums.length; i++) {
                int temp = 0;
                for (int j = i; j < nums.length; j++) {
                    temp += nums[j];
                    if (temp > result) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }

    /**
     * 动态规划
     * 确认初始状态dp[0] = nums[0]，状态转移方程dp[i] = Math.max(dp[i - 1], 0) + nums[i];
     * @param nums
     * @return
     */
    public static int maxSubArrayDynamic(int[] nums) {
        int result = 0;
        if (nums != null && nums.length > 0) {
            result = nums[0];
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                dp[i] = Math.max(dp[i - 1], 0) + nums[i];
                result = Math.max(dp[i], result);
            }
        }
        return result;
    }
}




