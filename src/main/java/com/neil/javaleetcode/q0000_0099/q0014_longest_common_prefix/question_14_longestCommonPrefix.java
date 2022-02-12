package com.neil.javaleetcode.q0000_0099.q0014_longest_common_prefix;
/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
/**
 * @author 张璘
 * @date 2021/7/17 15:42
 */
//编写一个函数来查找字符串数组中的最长公共前缀。
//
// 如果不存在公共前缀，返回空字符串 ""。
//
//
//
// 示例 1：
//
//
//输入：strs = ["flower","flow","flight"]
//输出："fl"
//
//
// 示例 2：
//
//
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。
//
//
//
// 提示：
//
//
// 0 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] 仅由小写英文字母组成
//
// Related Topics 字符串
// 👍 1692 👎 0
public class question_14_longestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        String common = longestCommonPrefix(strs);
    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs != null && strs.length > 1) {
            String tempCommon = strs[0];
            for (int i = 0; i < 200; i++) {
                Character tempCommonChar = null;
                if (i < tempCommon.length()) {
                    tempCommonChar = tempCommon.charAt(i);
                    for (int j = 1; j < strs.length; j++) {
                        if (i < strs[j].length()) {
                            char nowChar = strs[j].charAt(i);
                            if (nowChar != tempCommonChar.charValue()) {
                                tempCommonChar = null;
                                break;
                            }
                        } else {
                            tempCommonChar = null;
                            break;
                        }
                    }
                }
                if (tempCommonChar != null) {
                    result += tempCommonChar;
                } else {
                    break;
                }
            }
        } else if (strs != null && strs.length == 1) {
            result = strs[0];
        }
        return result;
    }
}
