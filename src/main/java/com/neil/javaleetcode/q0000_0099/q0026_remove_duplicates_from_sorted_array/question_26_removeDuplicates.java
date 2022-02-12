package com.neil.javaleetcode.q0000_0099.q0026_remove_duplicates_from_sorted_array;
/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */

/**
 * @author 张璘
 * @date 2021/7/17 15:48
 */
//给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
//
// 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
//
//
//
// 说明:
//
// 为什么返回数值是整数，但输出的答案是数组呢?
//
// 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
//
// 你可以想象内部操作如下:
//
//
//// nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
//int len = removeDuplicates(nums);
//
//// 在函数里修改输入数组对于调用者是可见的。
//// 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
//for (int i = 0; i < len; i++) {
//    print(nums[i]);
//}
//
//
//
// 示例 1：
//
//
//输入：nums = [1,1,2]
//输出：2, nums = [1,2]
//解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
//
//
// 示例 2：
//
//
//输入：nums = [0,0,1,1,1,2,2,3,3,4]
//输出：5, nums = [0,1,2,3,4]
//解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
//
//
//
//
// 提示：
//
//
// 0 <= nums.length <= 3 * 104
// -104 <= nums[i] <= 104
// nums 已按升序排列
//
//
//
// Related Topics 数组 双指针
// 👍 2117 👎 0
public class question_26_removeDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = removeDuplicates(nums);
    }

    /**
     * 创建一个慢指针 i，指向数组第一位数字，再创建一个快指针 j，指向数组第二位。
     * 若 nums[j] 和 nums[i] 不等，则先将 i 递增 1，然后把 nums[i] 改为 nums[j]。
     * 最终返回结果慢指针 所在位置+1。
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int result = 0;
        if (nums != null) {
            if (nums.length == 1) {
                result = 1;
            } else {
                int leftIndex = 0;
                for (int i = 1; i < nums.length; i++) {
                    int rightValue = nums[i];
                    if (nums[leftIndex] != rightValue) {
                        leftIndex++;
                        nums[leftIndex] = rightValue;
                    }
                }
                result = leftIndex + 1;
            }
        }
        return result;
    }
}
