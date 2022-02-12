package com.neil.javaleetcode;

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
// 有效字符串需满足：
//
//
// 左括号必须用相同类型的右括号闭合。
// 左括号必须以正确的顺序闭合。
//
//
// 注意空字符串可被认为是有效字符串。
//
// 示例 1:
//
// 输入: "()"
//输出: true
//
//
// 示例 2:
//
// 输入: "()[]{}"
//输出: true
//
//
// 示例 3:
//
// 输入: "(]"
//输出: false
//
//
// 示例 4:
//
// 输入: "([)]"
//输出: false
//
//
// 示例 5:
//
// 输入: "{[]}"
//输出: true
// Related Topics 栈 字符串
// 👍 2106 👎 0


import org.springframework.boot.SpringApplication;

import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)

/**
 * 有效的括号
 */
class question_20_isValid {
    public static void main(String[] args) {
        boolean result = isValid("([)");
        SpringApplication.run(JavaleetcodeApplication.class, args);
    }

    /**
     * 要求 栈 先进后出
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        boolean result = false;
        if (s != null && s.length() % 2 == 0) {
            char[] characters = s.toCharArray();
            List<Character> zheng = new ArrayList<>(characters.length / 2);
            result = true;
            for (int i = 0; i < characters.length; i++) {
                switch (characters[i]) {
                    case '{':
                        zheng.add('}');
                        break;
                    case '}':
                        if (zheng.size() > 0 && zheng.get(zheng.size() - 1) == '}') {
                            zheng.remove(zheng.size() - 1);
                        } else {
                            result = false;
                        }
                        break;
                    case '[':
                        zheng.add(']');
                        break;
                    case ']':
                        if (zheng.size() > 0 && zheng.get(zheng.size() - 1) == ']') {
                            zheng.remove(zheng.size() - 1);
                        } else {
                            result = false;
                        }
                        break;
                    case '(':
                        zheng.add(')');
                        break;
                    case ')':
                        if (zheng.size() > 0 && zheng.get(zheng.size() - 1) == ')') {
                            zheng.remove(zheng.size() - 1);
                        } else {
                            result = false;
                        }
                        break;
                    default:
                        break;
                }
                if (!result) {
                    break;
                }
            }
            if (zheng.size() > 0) {
                result = false;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

