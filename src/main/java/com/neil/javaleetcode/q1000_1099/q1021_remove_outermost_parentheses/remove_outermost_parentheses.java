package com.neil.javaleetcode.q1000_1099.q1021_remove_outermost_parentheses;
class remove_outermost_parentheses {
    public String removeOuterParentheses(String S) {
        StringBuilder res = new StringBuilder();
        int cnt = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                if (++cnt > 1) {
                    res.append('(');
                }
            } else {
                if (--cnt > 0) {
                    res.append(')');
                }
            }
        }
        return res.toString();
    }
}
