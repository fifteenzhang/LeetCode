package com.neil.javaleetcode.q0000_0099.q0028_implement_strstr;
/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */

/**
 * todo
 *
 * @author 张璘
 * @date 2021/7/17 17:42
 */
public class question_28_strStr {
    public static void main(String[] args) {
        int result = strStr("aaaaa", "bba");
    }

    /**
     * 滑动窗口
     * 返回第一个匹配的窗口
     * todo  timeout
     *
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        int result = 0;
        if (needle != null && needle.length() > 0) {
            int leftIndex = -1;
            if (haystack != null && needle.length() <= haystack.length()) {
                for (int i = 0; i < i + needle.length(); i++) {
                    if (i + needle.length() <= haystack.length()) {
                        leftIndex = i;
                        for (int j = 0; j < needle.length(); j++) {
                            if (haystack.charAt(i + j) != needle.charAt(j)) {
                                // 有一个失败之后，整个就可以移到下一个失败的地方
                                i = i + j - 1;
                                leftIndex = -1;
                                break;
                            }
                        }
                    }
                    if (leftIndex > -1) {
                        break;
                    }
                }
            }
            result = leftIndex;
        }
        return result;
    }
}
