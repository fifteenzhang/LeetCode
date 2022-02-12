package com.neil.javaleetcode.q1600_1699.q1614_maximum_nesting_depth_of_the_parentheses;
class maximum_nesting_depth_of_the_parentheses {
    public int maxDepth(String s) {
        int n = 0, ans = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                ans = Math.max(ans, ++n);
            } else if (c == ')') {
                --n;
            }
        }
        return ans;
    }
}
