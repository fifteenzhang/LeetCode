package com.neil.javaleetcode.q0100_0199.q0121_best_time_to_buy_and_sell_stock;
/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
//给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
//
// 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
//
// 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
//
//
//
// 示例 1：
//
//
//输入：[7,1,5,3,6,4]
//输出：5
//解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
//     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
//
//
// 示例 2：
//
//
//输入：prices = [7,6,4,3,1]
//输出：0
//解释：在这种情况下, 没有交易完成, 所以最大利润为 0。
//
//
//
//
// 提示：
//
//
// 1 <= prices.length <= 105
// 0 <= prices[i] <= 104
//
// Related Topics 数组 动态规划
// 👍 1411 👎 0

/**
 * @author 买卖股票的最佳时机
 * @date 2021/1/29 18:19
 */
public class question_121_maxProfit {
    public static void main(String[] args) {

        int result = maxProfit(new int[]{4, 6, 1, 7});
    }

    /**
     * 递归 当前-买入时间如果<0，则以当天为买入时间
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int result = 0;
        if (prices != null && prices.length > 1) {
            int startNum = prices[0];
            int tempMax = 0;
            for (int i = 1; i < prices.length; i++) {
                tempMax = prices[i] - startNum;
                if (tempMax < 0) {
                    startNum = prices[i];
                }
                result = Math.max(tempMax, result);
            }
        }
        return result;
    }
}
