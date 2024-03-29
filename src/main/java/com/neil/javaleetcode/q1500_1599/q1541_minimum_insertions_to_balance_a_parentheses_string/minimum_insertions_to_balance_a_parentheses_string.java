package com.neil.javaleetcode.q1500_1599.q1541_minimum_insertions_to_balance_a_parentheses_string;
class minimum_insertions_to_balance_a_parentheses_string {
     public int minInsertions(String s) {
        int left = 0;
        int res = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length;) {
            if (chars[i] == '(') {
                left++;
                i++;
            } else {
                // 连续2个 )
                if (i < chars.length - 1 && chars[i + 1] == ')') {
                    if (left > 0) {
                        left--;
                    } else {
                        res++;
                    }
                    i += 2;
                } else {
                    if (left > 0) {
                        left--;
                        res++;
                    } else {
                        res += 2;
                    }
                    i++;
                }
            }

        }
        if (left > 0) {
            res += 2 * left;
        }
        return res;
    }
}
