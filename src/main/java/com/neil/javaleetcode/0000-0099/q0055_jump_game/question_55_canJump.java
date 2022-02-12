/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.neil.javaleetcode;

import org.springframework.boot.SpringApplication;
//给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
//
// 数组中的每个元素代表你在该位置可以跳跃的最大长度。
//
// 判断你是否能够到达最后一个下标。
//
//
//
// 示例 1：
//
//
//输入：nums = [2,3,1,1,4]
//输出：true
//解释：可以先跳 1 步，从下标 0 到达下标 1, 然后再从下标 1 跳 3 步到达最后一个下标。
//
//
// 示例 2：
//
//
//输入：nums = [3,2,1,0,4]
//输出：false
//解释：无论怎样，总会到达下标为 3 的位置。但该下标的最大跳跃长度是 0 ， 所以永远不可能到达最后一个下标。
//
//
//
//
// 提示：
//
//
// 1 <= nums.length <= 3 * 104
// 0 <= nums[i] <= 105
//
// Related Topics 贪心算法 数组
// 👍 1033 👎 0

/**
 * 跳跃游戏
 *
 * @date 2021/2/4 18:41
 */
public class question_55_canJump {
    public static void main(String[] args) {
        boolean result = canJump(new int[]{2, 0, 0});
        SpringApplication.run(JavaleetcodeApplication.class, args);
    }

    /**
     * 解答成功:
     * 执行耗时:3 ms,击败了22.09% 的Java用户
     * 内存消耗:40.5 MB,击败了27.80% 的Java用户
     *
     * @param nums
     * @return
     */
    public boolean canJump2(int[] nums) {
        boolean result = false;
        if (nums != null && nums.length > 0) {
            if (nums[0] == 0 && nums.length == 1) {
                result = true;
            } else {
                int maxJump = 0;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == 0 && maxJump <= i) {
                        break;
                    } else if (nums[i] != 0) {
                        int currentJump = i + nums[i];
                        maxJump = Math.max(maxJump, currentJump);
                        if (currentJump >= nums.length - 1) {
                            result = true;
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }

    /**
     * 解答成功:
     * 执行耗时:2 ms,击败了81.34% 的Java用户
     * 内存消耗:40.3 MB,击败了75.71% 的Java用户
     * 少了一个if判断，提升了1ms
     *
     * @param nums
     * @return
     */
    public static boolean canJump(int[] nums) {
        boolean result = false;
        if (nums != null && nums.length > 0) {
            int maxJump = 0;
            for (int i = 0; i < nums.length; i++) {
                int currentJump = i + nums[i];
                maxJump = Math.max(maxJump, currentJump);
                if (currentJump >= nums.length - 1) {
                    result = true;
                    break;
                } else if (nums[i] == 0 && maxJump <= i) {
                    break;
                }
            }
        }
        return result;
    }


    /**
     * 解答成功:
     * 执行耗时:1 ms,击败了99.92% 的Java用户
     * 内存消耗:40.5 MB,击败了29.20% 的Java用户
     * 双重循环，但是没有加法，反而性能更好了
     *
     * @param nums
     * @return
     */
    public static boolean canJump3(int[] nums) {
        boolean res = true;
        if (nums.length < 2) return res;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (i == 0) return false;
                if (i > 0 && i < nums.length - 1) {
                    res = false;
                    int length = 1;
                    for (int j = i - 1; j >= 0; j--) {
                        if (nums[j] > length) {
                            res = true;
                        }
                        length++;
                    }
                    if (!res) return false;
                }
            }
        }
        return res;
    }
}
