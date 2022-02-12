package com.neil.javaleetcode.q0800_0899.q0856_score_of_parentheses;
class score_of_parentheses {
    public int scoreOfParentheses(String S) {
        int res = 0;
        for (int i = 0, d = 0; i < S.length(); ++i) {
            if (S.charAt(i) == '(') {
                ++d;
            } else {
                --d;
                if (S.charAt(i - 1) == '(') {
                    res += 1 << d;
                }
            }
        }
        return res;
    }
}
